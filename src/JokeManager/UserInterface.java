package JokeManager;

import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("X")){
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);

            } else if (input.equals("2")) {
                System.out.println("Drawing jokes: ");
                jokeManager.drawJokes();

            } else if (input.equals("3")) {
                System.out.println("Printing jokes.");
                jokeManager.printJokes();

            }else{
                System.out.println("Invalid command");
            }
        }
    }
}
