package PaymentCard;

public class Main {
    public static void main(String[] args){
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul's " + paulsCard);
        System.out.println("Matt's" + mattsCard);

        paulsCard.addMoney(20);

        mattsCard.eatHeartily();

        System.out.println("Paul's " + paulsCard);
        System.out.println("Matt's" + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("Paul's " + paulsCard);
        System.out.println("Matt's" + mattsCard);


    }


}
