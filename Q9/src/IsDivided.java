// Importing Scanner.
import java.util.Scanner;

public class IsDivided {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        int num1, num2; // Two whole numbers.

        // Getting the input from the user: the two numbers.
        System.out.println("Please the first number: ");
        num1 = scanner.nextInt();

        System.out.println("Please the second number: ");
        num2 = scanner.nextInt();

        // Checking which number is bigger.
        if (num1 > num2) {
            //Checking if the first number can be divided by the second one.
            if (num1 % num2 == 0) {
                System.out.println(num1 + " is divided by " + num2);
            } else {
                System.out.println(num1 + " is not divided by " + num2);
            }
        } else {
            // Checking if the second number can be divided by the first one.
            if (num2 % num1 == 0) {
                System.out.println(num2 + " is divided by " + num1);
            } else {
                System.out.println(num2 + " is not divided by " + num1);
            }
        }
    }
}
