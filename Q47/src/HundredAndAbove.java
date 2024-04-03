public class HundredAndAbove {
    public static void main(String[] args) {
        // Declaring the variables.
        int sum = 0; // -> The sum of all the numbers that are entered.
        final int MAX = 100; // -> The maximum number the sum is allowed to be.
        int num; // -> A random number between 1 - 10.

        while (sum <= MAX) {
            // Generating a random number between 1 and 10.
            num = (int)(Math.random() * 10) + 1;
            // Printing the number.
            System.out.print(num + " ");
            // Adding the number to the sum.
            sum += num;
        }
        // Printing the sum.
        System.out.println("The sum is " + sum);
    }
}
