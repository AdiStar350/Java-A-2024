// Importing the Scanner.
import java.util.Scanner;

public class BiggestNum {
    // Creating a new Scanner object.
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaring the variables.
        int bigNum; // -> The biggest number.
        int num; // -> The num from the user.

        // Getting the input from the user -> 10 numbers.
        System.out.println("Please enter 10 numbers: ");
        System.out.print("1. ");
        bigNum = scanner.nextInt();

        for(int i = 2; i <= 10; i++) {
            System.out.print(i + ". ");
            num = scanner.nextInt();

            if(bigNum < num) {
                bigNum = num;
            }
        }
        
        // Printing the biggest number.
        System.out.println("The biggest number is " + bigNum + ".");
    }
}
