// Importing the Scanner.
import java.util.Scanner;

public class StudentStatus {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        float grade1; // -> A student's grade.
        float grade2; // -> A student's grade.
        float grade3; // -> A student's grade.
        float avg; // -> The student's average.

        // Getting the input from the user -> A student's grade.
        System.out.println("Please enter the first grade: ");
        grade1 = scanner.nextFloat();

        // Getting the input from the user -> A student's grade.
        System.out.println("Please enter the second grade: ");
        grade2 = scanner.nextFloat();
        
        // Getting the input from the user -> A student's grade.
        System.out.println("Please enter the third grade: ");
        grade3 = scanner.nextFloat();
        
        // Calculating the average.
        avg = (grade1 + grade2 + grade3) / 3f;

        // Printing the condition of the student based on his average.
        if (avg > 90) {
            System.out.println("The student is excelling.");
        } else if (avg < 55) {
            System.out.println("The student needs to retake the courses.");
        } else {
            System.out.println("The student's grades meet the requirements.");
        }
    }
}
