// Importing the Scanner.
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        int people; // -> The number of people that order the pizza.
        int pizzaSlc; // -> The number of pizza slices that each person wants to eat.
        int fullPizza; // -> The number of pizzas that they need to order.
        int slcLeft; // -> The number of slices that are left after everyone ate.
        int totalSlc; // -> The number of slices in the whole order.

        // Getting the iput from the user -> The number of people that order the pizza.
        System.out.println("Please enter the number of people: ");
        people = scanner.nextInt();

        // Getting the input from the user -> The number of slices for each person to eat.
        System.out.println("Please enter the number of slices for each person: ");
        pizzaSlc = scanner.nextInt();

        // Calculating the number of slices for the whole order.
        totalSlc = pizzaSlc * people;

        // Calculating the number of slices left.
        slcLeft = totalSlc % 8;

        if (slcLeft == 1) {
            // Calculating the number of pizzas for the whole order.
            fullPizza = (totalSlc / 8) + 1;

            // Printing the number of pizzas for the whole order.
            System.out.println("The number of pizzas for the order should be " + fullPizza + ".");
            // Printing the number of pizza slices left.
            System.out.println("There is one remaining pizza slice.");
        } else if (slcLeft > 1) {
            // Calculating the number of pizzas for the whole order.
            fullPizza = (totalSlc / 8) + 1;

            // Printing the number of pizzas for the whole order.
            System.out.println("The number of pizzas for the order should be " + fullPizza + ".");
            // Printing the number of pizza slices left.
            System.out.println("There are " + slcLeft + " remaining pizza slices.");
        } else {
            // Calculating the number of pizzas for the whole order.
            fullPizza = totalSlc / 8;

            // Printing the number of pizzas for the whole order.
            System.out.println("The number of pizzas for the order should be " + fullPizza + ".");
        }
    }
}
