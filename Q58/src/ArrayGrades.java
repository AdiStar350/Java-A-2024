import java.util.Scanner;

public class ArrayGrades {
    public static void main(String[] args) {
        // Creating a new Scanner object.
        Scanner sc = new Scanner(System.in);

        // Declaring the variables.
        int gradesArray[] = new int[7]; // -> The array of grades.
        int illegalGradesCounter = 0; // -> Counter for illegal grades.
 
        // Getting the input from the user -> Values for the array of grades.
        for (int i = 0; i < gradesArray.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            gradesArray[i] = sc.nextInt();
        }
 
        // Loop to check grades validation.
        for (int i = 0; i < gradesArray.length; i++) {
            // Check if each grade is valid -> if not (count it).
            if (!(gradesArray[i] >= 0 && gradesArray[i] <= 100)) {
                illegalGradesCounter++;
            }
        }

        // Display if OK or how many grades are illegal.
        if (illegalGradesCounter == 0) {
                System.out.println("All grades are OK!");
        } else {
                System.out.println("There are " + illegalGradesCounter + " illegal grades.");
        }     	 
    }
}
