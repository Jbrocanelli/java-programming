package PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> info = new ArrayList<>();

        while(true){
            System.out.println("First name: ");
            String firstName = scanner.nextLine();

            if(firstName.isEmpty()){
                for(PersonalInformation i: info){
                    System.out.println(i);

                }
                break;
            }

            System.out.println("Last name: ");
            String lastName = scanner.nextLine();
            System.out.println("ID number: ");
            String id = scanner.nextLine();



            info.add(new PersonalInformation(firstName, lastName, id));

        }
    }
}
