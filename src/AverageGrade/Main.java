package AverageGrade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GradeRegister register = new GradeRegister();
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(register, scanner);

        userInterface.start();
    }
}
