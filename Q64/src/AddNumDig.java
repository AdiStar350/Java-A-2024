public class AddNumDig {
    public static void main(String[] args) {
        // => Declaring the variables.
        int[] numbers = new int[5]; // -> An array of integers. 
        int result = 0; // -> The result integer.

        // => Getting random values for the array.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        // => Adding each value to the result.
        for (int i = 0; i < numbers.length; i++) {
            result *= 10;
            result += numbers[i];
        }

        // => Printing the result.
        System.out.println(result);
    }
}
