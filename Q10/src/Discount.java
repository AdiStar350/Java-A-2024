// Importing the Scanner
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner scanner = new Scanner(System.in);
        // Declaring the variables.
        float pricePerUnit; // -> Price per single unit.
        int discountPrecentage; // -> The discount precentage for that item.
        int amount; // -> Amount of the same item.
        float totalNoDiscount; // -> The total price before the discount.
        float discount; // -> The price that the discount removes.
        float totalAfterDiscount; // -> The price after the discount.

        // Getting the input from the user -> Price per unit.
        System.out.println("Please enter the price per unit of the item: ");
        pricePerUnit = scanner.nextFloat();

        // Getting the input from the user -> Discount precentage.
        System.out.println("Please enter the discount for the item: ");
        discountPrecentage = scanner.nextInt();

        // Getting the input from the user -> Amount of items.
        System.out.println("Please enter the amount of the item: ");
        amount = scanner.nextInt();

        // Calculating the total price without the discount.
        totalNoDiscount = pricePerUnit * amount;

        // Calculating the discount.
        discount = totalNoDiscount * (discountPrecentage / 100f);

        // Calculating the total after the discount.
        totalAfterDiscount = totalNoDiscount - discount;

        // Printing the total price after the discount.
        System.out.println("The total price after the discount is " + totalAfterDiscount + ".");
    }
}
