public class SameDigLoop {
    public static void main(String[] args) {
        // Declaring the variables.
        int num; // -> A random number with 2 digits.

        do {
            // Generating a random number with 2 digits.
            num = (int)(Math.random() * 90 + 10);
            // Printing the number.
            System.out.print(num + " ");
        } while (num % 11 != 0); // Repeats until the number's digits are equal.
    }
}
