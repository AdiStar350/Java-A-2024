// Importing Scanner.
import java.util.Scanner;

public class AdPrice {
    public static void main(String[] args) {
        // Create a scanner object.
        Scanner scanner = new Scanner(System.in);
        //Declaring the variables.
        float pricePerSec, minutes; // The price per second for the ad, The number of minutes that the ad will be played.
        float pricePerMinute, totalPrice; // The price per minute for the ad, The total price for the whole ad.

        //Getting the input from the user: price per second, minutes.
        System.out.println("Please enter the price per second for the ad: ");
        pricePerSec = scanner.nextFloat();

        System.out.println("Please enter the number of minutes in the ad: ");
        minutes = scanner.nextFloat();

        //Checking if the number of minutes is greater than 5 minutes.
        //If it is, print the error message.
        if (minutes > 5) {
            System.out.println("The ad is too long, can't calculate the price.");
        } else { 
            // If it is not, continue to calculate and print the total price.
            //Calculating the price per minute.
            pricePerMinute = pricePerSec * 60;
            //Calculating the total price.
            totalPrice = pricePerMinute * minutes;

            //Printing the total price.
            System.out.println("The ad's total price is " + String.format("%.2f", totalPrice) + "$.");
        }
    }
}
