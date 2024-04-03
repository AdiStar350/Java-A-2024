// Importing the Scanner.
import java.util.Scanner;

public class Tri {
    // Creating a new Scanner object using "static" to use for the whole class.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int side1; // -> A side of a triangle.
        int side2; // -> A side of a triangle.
        int side3; // -> A side of a triangle.

        // Getting the input from the user -> A side of a triangle.
        System.out.println("Please enter the length of the first side: ");
        side1 = scanner.nextInt();

        // Getting the input from the user -> A side of a triangle.
        System.out.println("Please enter the length of the second side: ");
        side2 = scanner.nextInt();

        // Getting the input from the user -> A side of a triangle.
        System.out.println("Please enter the length of the third side: ");
        side3 = scanner.nextInt();

        // Checking the equality of the triangle.
        // Printing a fitting message.
        if ((side1 + side2 > side3) && (side2 + side3 < side1) && (side3 + side1 < side2)) {
            System.out.println("This is a valid triangle.");
        } else {
            System.out.println("This is not a valid triangle.");
        }
    }
}
