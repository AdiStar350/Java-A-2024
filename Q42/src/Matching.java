public class Matching {
    public static void main(String[] args) {
        // Declaring the variables.
        int num; // -> Random number.
        int lastNum = 0; // -> Last number generated.

        // Getting the numbers.
        for (int i = 0; i < 1; i++) {
            num = (int) (Math.random() * 10) + 1;
            System.out.print(num + " ");

            if (num != lastNum) {
                i--; // Repeats until they match.
                lastNum = num;
            }
        }
    }
}
