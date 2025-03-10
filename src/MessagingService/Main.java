package MessagingService;

public class Main {

    public static void main(String[] args) {

        MessagingService s = new MessagingService();
        Message message = new Message("Joao", "hello");

        s.add(message);

        System.out.println(message);


    }
}
