public class BigChar {
    public static void main(String[] args) {
        // TODO => Declare variable -> An array of 13 characters.
        char[] alpha = new char[13];

        // TODO => Declare variable -> The greatest character from the array.
        char greatestChar = 'A';

        // TODO => Get random uppercase characters for the array values.
        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = (char) (Math.random() * 26 + 65);

            // TODO => Get the greatest character from the array.
            if (alpha[i] > greatestChar) {
                greatestChar = alpha[i];
            }

            // TODO => Print the array.
            System.out.print(alpha[i] + " ");
        }
        
        // TODO => Print the greatest character.
        System.out.println("\nThe greatest character is " + greatestChar);
    }
}
