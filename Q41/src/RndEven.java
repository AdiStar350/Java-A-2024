public class RndEven {
    public static void main(String[] args) {
        // Declaring the variables;
        int num = 1; // -> A number between 1 and 10 which is even.

        // Getting 10 random numbers.
        for (int i = 1; i <= 10; i++) {
            num = (int) (Math.random() * 100) + 1;

            // Making sure the number is even.
            if (num % 2 != 0) {
                i--;
                continue;
            }

            // Printing the number.
            System.out.print(num + " ");
        }
    }
}
