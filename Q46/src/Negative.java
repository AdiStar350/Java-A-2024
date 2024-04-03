// Importing the Scanner object.
import java.util.Scanner;

public class Negative {
    // Creating a new Scanner object.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int num; // -> A whole number from the user.
        int max = 0; // -> The biggest number that has been entered.

        do {
            // Getting the input from the user -> A whole number.
            System.out.println("Please enter a whole positive number, or a negative one to stop: ");
            num = sc.nextInt();
            
            if (num > max) {
                max = num;
            } 

        } while (num >= 0); // Repeat until a negative number is entered.

        // Printing the max number.
        System.out.println("The max number is " + max);
    }
}
