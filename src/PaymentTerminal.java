public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        if(payment >= 2.50){
            money+= 2.50;
            affordableMeals++;
            return payment - 2.50;
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        else{
            return payment;
        }

    }

    public boolean eatAffordably(PaymentCard card){
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        if(card.balance() >= 2.50){
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        }
        else{
            return false;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        if (payment >= 4.30){
            money+= 4.30;
            heartyMeals++;
            return payment - 4.30;
        }
            return payment;
    }
    public boolean eatHeartily(PaymentCard card) {
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        if(card.balance() >= 4.30){
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        }
        else{
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0){
            card.addMoney(sum);
            money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}




