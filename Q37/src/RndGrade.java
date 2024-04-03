public class RndGrade {
    public static void main(String[] args) {
        // Declaring the variables;
        float sum = 0; // -> The sum of the students' grades.
        float avg; // -> The average of the students' grades.

        // Getting random numbers between 40 and 100 for the grades.
        for (int i = 1; i <= 7; i++) {
            // Calculating the sum of the grades.
            sum += (int) (Math.random() * 61) + 40;
        }

        // Calculating the average of the students' grades.
        avg = sum / 7f;

        // Printing the average.
        System.out.println("The average of the students' grades is: " + String.format("%.2f", avg) + ".");
    }
}
