// Importing the Scanner.
import java.util.Scanner;

public class threeNumbers {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        int tempMorn; // -> The temperature measured (in Celsius) in the morning.
        int tempNoon; // -> The temperature measured (in Celsius) in the noon.
        int tempEve; // -> The temperature measured (in Celsius) in the evening.

        // Getting the input from the user.
        System.out.println("Please enter the temperature that was measured in the morning: ");
        tempMorn = scanner.nextInt();

        // Getting the input from the user.
        System.out.println("Please enter the temperature that was measured in the noon: ");
        tempNoon = scanner.nextInt();

        // Getting the input from the user.
        System.out.println("Please enter the temperature that was measured in the evening: ");
        tempEve = scanner.nextInt();

        // Checking if there have been an increase in temperature between the morning and the noon.
        // Printing a message to the user.
        if (tempMorn < tempNoon) {
            System.out.println("There was an increase in the temperature between the morning and the noon.");
        } else {
            System.out.println("There was not an increase in the temperature between the morning and the noon.");
        }

        // Checking if there have been an increase in temperature between the morning and the noon.
        // Printing a message to the user.
        if (tempNoon > tempEve) {
            System.out.println("There was a decrease in the temperature between the noon and the evening.");
        } else {
            System.out.println("There was not a decrease in the temperature between the noon and the evening.");
        }
    }
}
