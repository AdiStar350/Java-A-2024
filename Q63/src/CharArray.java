public class CharArray {
    public static void main(String[] args) {
        // => Declaring the variables.
        char[] chars = new char[13]; // -> An array of uppercase characters.
        int randomIndex1 = (int) (Math.random() * chars.length), randomIndex2; // -> Random indexes in the array.
        
        // => Making sure that the indexes are not the same.
        do {
            randomIndex2 = (int) (Math.random() * chars.length);
        } while (randomIndex1 == randomIndex2);

        // => Printing the indexes.
        System.out.println(randomIndex1 + ", " + randomIndex2);

        // => Printing the array.
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (Math.random() * 26 + 65);
            System.out.print(chars[i] + " ");
        }

        // => Printing a message based on the equality of the chosen characters.
        if (chars[randomIndex1] == chars[randomIndex2]) {
            System.out.println("\nSame chars");
        } else {
            System.out.println("\nDifferent chars");
        }
    }
}
