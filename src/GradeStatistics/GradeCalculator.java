package GradeStatistics;

import java.util.ArrayList;

public class GradeCalculator {
    private ArrayList<Integer> points;

    public GradeCalculator(){
        this.points = new ArrayList<>();
    }


    public void add(int points) {
        if (points >= 0 && points <= 100) {
            this.points.add(points);
        }
    }

    public ArrayList<Integer> getPoints(){
        return this.points;
    }

    public double pointAverage(ArrayList<Integer> points){
        int sum = 0;
        for (int point : points){
            sum += point;
        }
        return (double) sum/points.size();
    }

    public double passingGradeAverage(ArrayList<Integer> points){
        int numberOfGrades = 0;
        int sum = 0;
        for (int point : points){
            if(point >= 50 && point <= 100){
                sum+= point;
                numberOfGrades++;
            }
        }
        // account for no passing grades
        if(numberOfGrades == 0){
            return -1;
        }
        return (double) sum/numberOfGrades;
    }

    public double passPercentage(ArrayList<Integer> points) {

        int participants = 0;
        int passing = 0;

        for(int point : points){
            if(point >= 0 && point <= 100){
                participants++;
            }
            if(point >= 50 && point <= 100){
                passing++;
            }
        }
        int percentage = (100 * passing/participants);

        return (double) percentage;

    }

    public void gradeDistribution() {
        // Array to hold counts for grades 0 to 5
        int[] grades = new int[6];
        int[] threshold = {50, 60, 70, 80, 90};

        for (int point : points) {
            int grade = 0; // Default to grade 0 if below 50
            for (int i = threshold.length - 1; i >= 0; i--) {
                if (point >= threshold[i]) {
                    grade = i + 1; // Map thresholds index to grade (1 to 5)
                    break;
                }
            }
            // Increment only if grade is in valid range (0 to 5)
            grades[grade]++;
        }

        System.out.println("Grade distribution:");

        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.print(i + ": "); // Print the grade
            System.out.println("*".repeat(grades[i])); // Print stars based on count
        }
    }

}

