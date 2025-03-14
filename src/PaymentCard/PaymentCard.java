package PaymentCard;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance){
        this.balance = balance;
    }

    public void eatAffordably(){
        if(this.balance >= 2.60){
            this.balance -=2.60;
        }
    }

    public void eatHeartily(){
        if(this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount){
        if(balance + amount >= 150) {
            this.balance = 150;
        } else if (this.balance + amount >= 0) {
            this.balance += amount;
        }
    }

    @Override
    public String toString(){
        return " card has a balance of " + this.balance + " euros";
    }
}
