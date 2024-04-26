import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.println("Enter average percentage: ");
        double averagePercentage = scanner.nextDouble();

        double obtainedMarks = (averagePercentage / 100) * totalMarks;

        System.out.println("Obtained marks: " + obtainedMarks);

        // Grade calculation
        if (averagePercentage >= 90) {
            System.out.println("Grade: A");
        } else if (averagePercentage >= 80) {
            System.out.println("Grade: B");
        } else if (averagePercentage >= 70) {
            System.out.println("Grade: C");
        } else if (averagePercentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}