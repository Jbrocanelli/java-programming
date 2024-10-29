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

    @Override
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Money)){
            return false;
        }

        Money comparedMoney = (Money) compared;

        if(this.cents == comparedMoney.cents && this.euros == comparedMoney.euros){
            return true;
        }
        return false;
    }

    public Money plus(Money addition){
        Money clone = new Money(euros, cents);
        int newEuros = clone.euros + addition.euros;
        int newCents = clone.cents + addition.cents;

        if (newCents >= 100){
            // add 1 euro
            newEuros += 1;
            // convert cents
            newCents = newCents % 100;
        }

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        else{
            return false;
        }
    }

    public Money minus(Money decreaser){
        Money clone = new Money(euros, cents);
        int newEuros = clone.euros - decreaser.euros;
        int newCents = clone.cents - decreaser.cents;

        if(newCents < 0){
            newEuros -= 1;
            newCents += 100;

        }
        if(newEuros < 0){
            return new Money(0, 0);

        }
        return new Money(newEuros, newCents);
    }



}
