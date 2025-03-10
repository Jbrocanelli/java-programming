package BigYear;

import java.util.Scanner;

public class UserInterface {
    private BirdDatabase database;
    private Scanner scanner;

    public UserInterface(BirdDatabase database, Scanner scanner) {
        this.database = database;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            // Quit command
            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            // Add command
            if (command.equalsIgnoreCase("add")) {
                System.out.print("Name: ");
                String birdName = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String birdInLatin = scanner.nextLine();
                // Add bird to database
                database.addBird(new Bird(birdName, birdInLatin));
            }

            // All command
            if (command.equalsIgnoreCase("all")) {
                database.printBirds();
            }

            // Observation command
            if (command.equalsIgnoreCase("observation")) {
                System.out.print("Bird? ");
                String birdCheck = scanner.nextLine();
                database.addBirdObservation(birdCheck);
            }

            if (command.equalsIgnoreCase("one")){
                System.out.print("Bird? ");
                String birdToPrint = scanner.nextLine();
                database.printABird(birdToPrint);
            }

        }
    }
}
