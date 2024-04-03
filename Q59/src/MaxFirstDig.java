public class MaxFirstDig {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] numbers = new int[7]; // -> An array of numbers.
        int maxDig; // -> The number with the biggest first digit.

        // Getting the array data and printing the array.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
            System.out.print(numbers[i] + " ");
        }

        // Intializing the maxDig variable.
        maxDig = numbers[0];

        // Checking which number has the biggest first digit.
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 10 > maxDig % 10) {
                maxDig = numbers[i];
            }
        }

        // Printing the number with the biggest first digit.
        System.out.println("\nThe number with the biggest first digit is: " + maxDig);
    }
}

