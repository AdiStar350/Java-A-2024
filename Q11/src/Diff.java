import java.util.Scanner;

public class Diff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Initializing the variables.
        int num1, num2, diff;

        //Getting input from the user.
        System.out.println("Please enter the first number: ");
        num1 = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        num2 = scanner.nextInt();

        //Checking which number is bigger and calculating the difference.
        if (num1 > num2) {
            diff = num1 - num2;
        } else {
            diff = num2 - num1;
        }

        System.out.println("The difference between the two numbers is " + diff + ".");
    }
}
