public class NeighboringNums {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] numbers = new int[7]; // An array of random numbers between 1 and 10.

        // Getting random numbers for the array.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10 + 1);
            
            // Printing the array.
            System.out.print(numbers[i] + " ");
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            // Checking if the neighboring number is the same as the current number.
            if (numbers[i] == numbers[i + 1]) {
                // Printing the numbers' value.
                System.out.println("\nThere are neighbors here: " + numbers[i] + ", " + numbers[i + 1]);
            }
        }
    }
}
