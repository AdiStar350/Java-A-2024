public class SumToZero {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] numbers = new int[13]; // -> An array of numbers.
        int sum = 0; // -> The sum of the first 12 numbers in the array.

        // Getting random values between -10 and 10 for the 12 first numbers in the array.
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = (int) (Math.random() * 21 - 10);
            // Adding each value to the sum variable.
            sum += numbers[i];
        }
        
        // Initializing th last value in the array to be the difference between sum and 0.
        numbers[numbers.length - 1] = -sum;

        // Printing th array.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
