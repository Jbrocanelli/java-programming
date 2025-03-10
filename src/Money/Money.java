package Money;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition){
        int totalCents = this.cents() + addition.cents();
        int totalEuros = this.euros() + addition.euros() + (totalCents/100);
        int centsRemaining = totalCents % 100;

        return new Money(totalEuros, centsRemaining);
    }

    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        else {
            return false;
        }
    }

    public Money minus(Money decreaser){
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newEuros < 0) {
            return new Money(0, 0);
        }

        if (newCents < 0) {
            if (newEuros > 0) {
                newEuros -= 1;
                newCents += 100;
            } else {
                return new Money(0, 0);
            }
        }

        return new Money(newEuros, newCents);
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Money)){
            return false;
        }

        Money comparedMoney = (Money) compared;

        if(this.euros == comparedMoney.euros && this.cents == comparedMoney.cents){
            return true;
        }
        return false;
    }
}
