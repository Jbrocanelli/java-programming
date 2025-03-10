package LiquidContainers2;

import java.util.Scanner;

public class UserInterface {
    private Container container1;
    private Container container2;
    private Scanner scanner;

    public UserInterface(Container container1, Container container2, Scanner scanner) {
        this.container1 = container1;
        this.container2 = container2;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            try {
                String parts[] = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (command.equals("add")) {
                    container1.add(amount);
                } else if (command.equals("move")) {
                    if (container1.contains() - amount >= 0) {
                        container2.add(amount);
                        container1.remove(amount);
                    } else {
                        int containerClone = container1.contains();
                        container1.remove(container1.contains());
                        container2.add(containerClone + container1.contains());
                    }
                } else if (command.equals("remove")) {
                    container2.remove(amount);
                }
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

