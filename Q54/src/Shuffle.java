public class Shuffle {
    /* A method that gets:
        => int[] array -> Any array.
        => int index -> The index of the element you want to check.
     
    And checks if all the elements before the element with index "index" are different
    from that element. 
    
    This method will return "true" if it does find a duplicate.

    Otherwise it will return "false". */
    public static boolean checkArray(int[] array, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (array[i] == array[index]) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // Declaring the variables.
        int[] arrayOfNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; // -> An array of integers.
        int[] shuffledArray = new int[arrayOfNums.length]; // -> The shuffled array.
        int[] chosenIndexes = new int[arrayOfNums.length]; // -> The chosen indexes will be inserted into this array.
        int temp; // -> Temporary value for switching array places values.
        boolean flag; // -> A flag indicating if the index is equal to the value itself in the chosenIndexes array.

        // Printing the original array.
        System.out.print("The original array is: ");
        for (int i = 0; i < arrayOfNums.length; i++) {
            System.out.print(arrayOfNums[i] + " ");
        }

        // Printing the shuffled array.
        System.out.print("\nThe Shuffled array is: ");

        // Looping throught the original array.
        for (int i = 0; i < arrayOfNums.length; i++) {
            do {
                // Initializing the flag variable each loop.
                flag = false;
                // Choosing a new random index each loop.
                chosenIndexes[i] = (int)(Math.random() * arrayOfNums.length);

                
                if (chosenIndexes[arrayOfNums.length - 1] == arrayOfNums[arrayOfNums.length - 1]) {
                    /* Checking for an end case where the amount of numbers in the array is odd, 
                    and all of the numbers have been assigned but the last.
                    Which means that the last number woud be assigned with the same value index.
                    That is not allowed in shuffling, so we switch the last value and the first. */ 
                    temp = chosenIndexes[0];
                    chosenIndexes[0] = chosenIndexes[arrayOfNums.length - 1];
                    chosenIndexes[arrayOfNums.length - 1] = temp;
                } else if (chosenIndexes[i] == i) {
                    // Checking if the value is the same as its index.
                    flag = true;
                }
            } while (checkArray(chosenIndexes, i) || flag); // Repeats until the value is different from its own index.

            // Assigning the value of the numbers array with the index in the chosenIndexes array to the new shuffled array.
            shuffledArray[i] = arrayOfNums[chosenIndexes[i]];
            System.out.print(shuffledArray[i] + " ");
        }
    }
}
