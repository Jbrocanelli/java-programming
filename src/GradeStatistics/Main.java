package GradeStatistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GradeCalculator calculator = new GradeCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops: ");
        while(true){

            int points = Integer.valueOf(scanner.nextLine());
            if(points == -1){
                break;
            }
            else{
                calculator.add(points);
            }

        }
        System.out.println("Point average(all): " + calculator.pointAverage(calculator.getPoints()));
        double avg = calculator.passingGradeAverage(calculator.getPoints());
        if(avg >= 50){
            System.out.println("Point average(passing): " + avg);
        }
        if(avg <= 0){
            System.out.println("Point average(passing): - ");
        }
        System.out.println("Pass percentage: " + calculator.passPercentage(calculator.getPoints()));
        calculator.gradeDistribution();
    }
}
