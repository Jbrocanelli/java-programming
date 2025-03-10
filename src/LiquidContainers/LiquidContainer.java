package LiquidContainers;

import java.util.Scanner;

public class LiquidContainer {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int maxVolume = 100;

        while (true) {
            System.out.println("First: " + first + "/" + maxVolume);
            System.out.println("Second " + second + "/" + maxVolume);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            try {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);


                if (command.equals("add") && amount >= 0) {
                    if (amount <= maxVolume) {
                        first += amount;
                    } else if (amount > maxVolume) {
                        first = maxVolume;
                    }
                } else if (command.equals("move") && amount >= 0) {
                    if (first - amount >= 0) {
                        second += amount;
                        first -= amount;
                        if (second >= maxVolume) {
                            second = maxVolume;
                        }
                    } else if (first - amount < 0) {
                        second += first;
                        first = 0;
                        if (second >= maxVolume) {
                            second = maxVolume;
                        }
                    }
                } else if (command.equals("remove") && amount >= 0) {
                    if (amount <= second) {
                        second -= amount;
                    }
                    if (amount > second) {
                        second = 0;
                    }
                }

            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
