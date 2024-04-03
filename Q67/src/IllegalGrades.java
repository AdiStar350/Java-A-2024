// TODO => Import Scanner object.
import java.util.Scanner;

public class IllegalGrades {
    // TODO => Create a new Scanner object.
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO => Declare variable -> An array of 13 grades.
        int[] grades = new int[13];

        // TODO => Declare variable -> The amount of illegal grades.
        int illegalGradeCount = 0;

        // TODO => Declare variable -> The percentage of illegal grades compared to the total.
        float illegalGradesPercentage;

        
        for (int i = 0; i < grades.length; i++) {
            // TODO => Get input from the user -> The values of the grades for the array.
            System.out.print("Please enter grades " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
            System.out.println();
        }

        for (int i = 0; i < grades.length; i++) {
            // TODO => Print the array.
            System.out.print(grades[i] + " ");

            // TODO => Count the illegal grades.
            if (grades[i] > 100 || grades[i] < 0) {
                illegalGradeCount++;
            }
        }

        // TODO => Calculate the percentage of the illegal grades.
        illegalGradesPercentage = (float) illegalGradeCount / 13f;
        illegalGradesPercentage *= 100;

        // TODO => Print the percentage.
        System.out.println("\nThe illegal grades percentage is " + (int) illegalGradesPercentage + "%");

        // TODO => If the percentage is below 20% -> Print a message to validate the system.
        if (illegalGradesPercentage > 20) {
            System.out.println("\nPlease validate the system and try again.");
        }
    }
}
