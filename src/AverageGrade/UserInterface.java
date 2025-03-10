package AverageGrade;

import java.util.Scanner;

public class UserInterface {
    private GradeRegister gradeRegister;
    private Scanner scanner;

    public UserInterface(GradeRegister gradeRegister, Scanner scanner) {
        this.gradeRegister = gradeRegister;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Points: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            int points = Integer.valueOf(input);
            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }
            gradeRegister.addGradeBasedOnPoints(points);

            }

        // print new line
        System.out.println();

        // print stars
        int grade = 5;
        while (grade >= 0) {
            int stars = gradeRegister.numberOfGrades(grade);
            System.out.print(grade + ": ");
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }
            System.out.println("");

            grade = grade - 1;

        }
        System.out.println("The average of points: " + gradeRegister.averageOfPoints());
        System.out.println("The average of grades: " + gradeRegister.averageOfGrades());
    }
}
