// Importing the Scanner.
import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring variables.
        int grade1; // -> A students grade.
        int grade2; // -> A students grade.
        int grade3; // -> A students grade.
        float avg; // -> The average of the student's grades.
        final float pass = 55f; // -> The passing grade.

        // Getting input from the user -> A students grade.
        System.out.println("Please enter the first grade: ");
        grade1 = scanner.nextInt();

        // Getting input from the user -> A students grade.
        System.out.println("Please enter the second grade: ");
        grade2 = scanner.nextInt();

        // Getting input from the user -> A students grade.
        System.out.println("Please enter the third grade: ");
        grade3 = scanner.nextInt();

        // Calculating the average grade.
        avg = (grade1 + grade2 + grade3) / 3f;
        // Printing the average grade.
        System.out.println("The average grade is " + String.format("%.2f", avg) + ".");
        
        // Printing if the student has passed or not.
        if (avg >= pass) {
            System.out.println("You have passed!");
        } else {
            System.out.println("You have failed!");
        }
    }
}
