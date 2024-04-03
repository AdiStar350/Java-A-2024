// => Import the Scanner object.
import java.util.Scanner;

public class EvenArray {
    // => Creating a new Scanner object.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // => Declaring the variables.
        int[] numbers = new int[7]; // -> An array of 7 integers.
        int numInput; // -> The input from the user for the array values.

        // => Getting the input from the user for the array values.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number: ");
            numInput = sc.nextInt();

            // => The input will go into the array only if it is even.
            if (numInput % 2 == 0) {
                numbers[i] = numInput;
            } else {
                i--;
            }
        }

        // => Printing the array.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
