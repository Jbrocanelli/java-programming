package BigYear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BirdDatabase database = new BirdDatabase();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(database, scanner);

        System.out.println("Welcome to the bird database!");
        System.out.println("Commands: ");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints a specific bird");
        System.out.println("Quit - quits the program");

        userInterface.start();
    }
}
