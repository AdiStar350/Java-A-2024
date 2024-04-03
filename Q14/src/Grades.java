// Importing the Scanner.
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        // Creating a new Scanner.
        Scanner scanner = new Scanner(System.in);
        // Declaring variables.
        int grade1; // -> A student grade.
        int grade2; // -> A student grade.
        int gradeTest; // -> A student grade.
        float finale; // -> The final grade

        // Getting the input from the user -> A student grade.
        System.out.println("Please enter the first grade: ");
        grade1 = scanner.nextInt();
        // Getting the input from the user -> A student grade.
        System.out.println("Please enter the second grade: ");
        grade2 = scanner.nextInt();
        // Getting the input from the user -> A student grade.
        System.out.println("Please enter the test grade: ");
        gradeTest = scanner.nextInt();

        // Calculating the final grade.
        finale = (grade1 * (20/100f)) + (grade2 * (25/100f)) + (gradeTest * (55/100f));
        // Printing the final grade.
        if (finale == 100f) {
            int avg = (grade1 + grade2 + gradeTest) / 3;
            System.out.println("The final grade is 100. The average grade is " + avg + ".");
        } else {
            System.out.println("The final grade is " + (int) finale + ".");
        }
    }
}
