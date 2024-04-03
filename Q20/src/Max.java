// Importing the Scanner.
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        // Craeting a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        int num1; // -> A whole number.
        int num2; // -> A whole number.
        int num3; // -> A whole number.
        int max; // -> The biggest number.

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the first number: ");
        num1 = scanner.nextInt();

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the second number: ");
        num2 = scanner.nextInt();

        // Getting the input from the user -> A whole number.
        System.out.println("Please enter the third number: ");
        num3 = scanner.nextInt();


        // Checking which number is the bigest.
        if (num1 > num2) {
            max = num1;

            if (num3 > num1) {
                max = num3;
            }
        } else {
            max = num2;

            if (num3 > num2) {
                max = num3;
            }
        }

        // Printing the biggest number to the user.
        System.out.println("The biggest number is " + max + ".");
    }
}
