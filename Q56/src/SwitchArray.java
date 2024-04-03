public class SwitchArray {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] array = {1, 2, 3, 4, 5, 6, 7}; // -> An array of 7 integers.
        int temp; // -> A temporary value for switching variable values.

        // Switching the first and the last values, second and before-last values, and so on...
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Printing the new array.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
