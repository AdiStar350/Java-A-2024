public class Dice {
    public static void main(String[] args) {
        // Declaring the variables.
        int dice1, dice2; // -> A 6 sides dice.
        int count = 0; // -> The number of times the dice had the same value.

        for (int i = 1; i <= 10; i++) {
            // Getting random numbers for the dice.
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;

            // Printing the dice values.
            System.out.println("Dice1: " + dice1);
            System.out.println("Dice2: " + dice2 + "\n");

            // Counting the number of times the dice had the same value.
            if(dice1 == dice2) {
                count++;    
            }
        }

        // Printing the count to the screen.
        System.out.println("Doubles: " + count);
    }
}
