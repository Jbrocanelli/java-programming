package NumbersFromAFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> finalNumbers = new ArrayList<>();

        System.out.println("File? ");
        String file = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                numbers.add(Integer.valueOf(reader.nextLine()));
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Lower bound? ");
        int lower = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Upper bound? ");
        int upper = scanner.nextInt();
        scanner.nextLine();

        for (int number : numbers) {
            if (number >= lower && number <= upper) {
                finalNumbers.add(number);
            }
        }

        System.out.println("Numbers: " + finalNumbers.size());
        scanner.close();


    }
}
