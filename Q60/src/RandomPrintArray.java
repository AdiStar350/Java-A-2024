public class RandomPrintArray {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] numbers = new int[7]; // -> An array of numbers.
        int randomIndex; // -> A random index.

        for (int i = 0; i < numbers.length; i++) {
            // Getting random values for the array between 1 and 100.
            numbers[i] = (int) (Math.random() * 100 + 1);
            // Printing the array.
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Looping through the array.
        for (int i = 0; i < numbers.length; i++) {
            // Each loop getting a new random index.
            randomIndex = (int) (Math.random() * 7);

            // Checking if the value at that index is 0.
            // If it is not 0 then print the value and change it to 0.
            // Else, try again.
            if (numbers[randomIndex] != 0) {
                System.out.print(numbers[randomIndex] + " ");
                numbers[randomIndex] = 0;
            } else {
                i--;
            }
        }
    }
}
