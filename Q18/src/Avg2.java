// Importing the Scanner.
import java.util.Scanner;

public class Avg2 {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        int grade1; // -> A student's grade.
        int grade2; // -> A student's grade.
        int grade3; // -> A student's grade.
        float avg; // -> The average of the three grades.
        final float passAvg = 55f; // -> The passing average.
        final int passGrade = 50; // -> The passing grade.

        // Getting the input from the user -> A student's grade.
        System.out.println("Please enter the first grade: ");
        grade1 = scanner.nextInt();

        // Getting the input from the user -> A student's grade.
        System.out.println("Please enter the second grade: ");
        grade2 = scanner.nextInt();

        // Getting the input from the user -> A student's grade.
        System.out.println("Please enter the third grade: ");
        grade3 = scanner.nextInt();

        // Calculating the average.
        avg = (grade1 + grade2 + grade3) / 3f;

        // printing the average.
        System.out.println("The average is " + String.format("%.2f", avg) + ".");
        
        // Checking if the conditions allow for a student to pass or to fail, and printing the answer.
        if ((grade1 >= passGrade) && (grade2 >= passGrade) && (grade3 >= passGrade) && (avg >= passAvg)) {
            System.out.println("You have passed!");
        } else {
            System.out.println("You have failed!");
        }
    }
}
