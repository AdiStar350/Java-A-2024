public class MaxGrade {
    public static void main(String[] args) {
        // Declaring the variables.
        int[] grades = new int[7]; // -> An array of 7 students grades.
        int high = 0; // -> The highest grade in the array.

        for (int i = 0; i < grades.length; i++) {
            // Getting random grades for the grades array.
            grades[i] = (int)(Math.random() * 101);

            // Printing the grades array.
            System.out.print(grades[i] + " ");

            // Checking for the highest grade.
            if (grades[i] > high) {
                high = grades[i];
            }
        }

        // Printing the highest grade.
        System.out.println("\nThe highest grade is " + high);
    }
}
