public class RandomArray {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // -> An array with the numbers from 0 to 9.
        int randomNumber;

        // Getting a random number from the array.
        randomNumber = array[(int)(Math.random() * 10)];
        
        // Printing that number.
        System.out.println("Value: " + randomNumber);
    }
}
