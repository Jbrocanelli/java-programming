package GuestListFromAFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guests = new ArrayList<>();

        System.out.println("Name of file: ");
        String file = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                guests.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Enter name, an empty line quits.");
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                System.out.println("Thank you");
                break;
            }

            if(guests.contains(input)){
                System.out.println("The name is on the list");
            }
            else{
                System.out.println("The name is not on the list");
            }

        }

    }
}
