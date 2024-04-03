// Importing the Scanner.
import java.util.Scanner;

public class BetterGrade {
    // Creating a new Scanner object.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int grade; // -> The grade of the student.
        int sum = 0; // -> The sum of the grades.
        int low = 100; // -> The lowest grade.
        float avg; // -> The average of the grades.

        // Getting the input from the user -> 7 numbers.
        System.out.println("Please enter 7 numbers: ");
        
        for(int i = 1; i <= 7; i++) {
            System.out.print(i + ". ");
            grade = scanner.nextInt();
            sum += grade;

            if(grade < low) {
                low = grade;
            }
        }

        // Calculating the sum without the lowest grade.
        sum -= low;
        // Calculating the average of the numbers.
        avg = sum / 6f;
        // Printing the average of the numbers.
        System.out.println("The average is " + String.format("%.2f", avg) + ".");
    }
}
