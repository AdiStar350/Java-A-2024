public class Game1 {
    public static void main(String[] args) {
        // Declaring the variables.
        int compDie; // -> The number of the computer's die.
        int userDie; // -> The number of the user's die.
        int compWin = 0; // -> The number of times the computer won.
        int userWin = 0; // -> The number of times the user won.

        // Initalizing a round.
        for(int i = 1; i <= 10; i++) {
            // Rolling the dice.
            compDie = (int) (Math.random() * 6) + 1;
            userDie = (int) (Math.random() * 6) + 1;

            // Printing the dice values.
            System.out.println("The computer's die: " + compDie);
            System.out.println("The user's die: " + userDie + "\n");

            // Comparing results.
            if(compDie < userDie) {
                System.out.println("The user won the round!\n");
                userWin++;
            } else if(compDie > userDie) {
                System.out.println("The computer won the round!\n");
                compWin++;
            } else {
                System.out.println("It's a tie!\n");
            }
        }

        // Printing the win count for each one.
        System.out.println("The computer won: " + compWin + " times.");
        System.out.println("The user won: " + userWin + " times.\n");

        // Checking who won the game.
        if(compWin < userWin) {
            System.out.println("The user won!");
        } else if(compWin > userWin) {
            System.out.println("The computer won!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
