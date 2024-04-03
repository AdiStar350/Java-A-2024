public class ArrayBalance {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] array = new int[(int)(Math.random() * 8 + 2)]; // -> An array of integers.
        int even = 0; // -> Even numbers counter.
        int odd = 0; // -> Odd numbers counter.
        
        // Getting random array values.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100 + 1);
            System.out.print(array[i] + " ");
        }

        // Checking how many are odd or even.
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Checking if the array is balanced.
        if (even == odd) {
            System.out.println("\nThe array is balanced");
        } else {
            System.out.println("\nThe array is unbalanced");
        }
    }
}
