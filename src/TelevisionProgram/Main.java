package TelevisionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();

        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();

            if(name.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.println("Program's maximum duration: ");
        int duration = scanner.nextInt();
        for(TelevisionProgram program: programs){
            if (program.getDuration() <= duration){
                System.out.println(program);
            }
        }
    }
}
