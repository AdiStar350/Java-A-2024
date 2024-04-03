public class TempArray {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] temp = new int[7]; // -> The temperature array.
        int minusOrPlus; // -> A random number between 0 and 1, decides whether the temperature is negative or positive.

        // Assigning random values to the array.
        for (int i = 0; i < 7; i++) {
            minusOrPlus = (int) (Math.random() * 2);
            temp[i] = (int) (Math.random() * 51);

            if (minusOrPlus == 1) {
                temp[i] = -temp[i];
            }

            // Printing the array is.
            System.out.print(temp[i] + " ");
        }

        // Checking for increasing temperatures between the days.
        for (int i = 0; i < 6; i++) {
            if (temp[i] < temp[i + 1]) {
                System.out.println("\nThere has been a temperature increase between day " + (i + 1) + " and day " + (i + 2));
            }
        }
    }
}
