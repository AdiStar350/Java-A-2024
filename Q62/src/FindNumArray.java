// Importing the scanner.
import java.util.Scanner;

public class FindNumArray {
    // Creating a new static Scanner object.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int[] numbers = new int[10]; // -> An array of numbers between 1 and 100.
        int search; // -> The number the user wants to search for in the array.
        int place = 0; // -> The place of the number that the user wants to search for in the array.

        // Getting random values for the array values and printing them out.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
            System.out.print(numbers[i] + " ");
        }

        // Asking the user to enter the number he wants to search for.
        System.out.print("\nPlease enter a the number you want to search for: ");
        search = sc.nextInt();

        // Getting the place value by looping through the array.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                place = i + 1;
            }
        }

        // Checking for the given conditions with the place value and printing a fitting message
        if (place == 0) {
            System.out.println("The number you are looking for is not in the array.");
        } else if (place == 1) {
            System.out.println("The number you are looking for is in the first place.");
        } else if (place == numbers.length) {
            System.out.println("The number you are looking for is in the last place.");
        } else if (numbers.length % 2 == 0) {
            if (place == numbers.length / 2 || place == (numbers.length + 2) / 2) {
                System.out.println("The number you are looking for is exactly in the middle.");
            } else if (place < numbers.length / 2) {
            System.out.println("The number you are looking for is in the first half.");
            } else {
                System.out.println("The number you are looking for is in the second half.");
            }
        } else if (numbers.length % 2 != 0) {
            if (place == numbers.length / 2 + 1) {
                System.out.println("The number you are looking for is exactly in the middle.");
            } else if (place <= numbers.length / 2) {
            System.out.println("The number you are looking for is in the first half.");
            } else {
            System.out.println("The number you are looking for is in the second half.");
            } 
        }
    }
}
