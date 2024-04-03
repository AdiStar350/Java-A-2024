import java.util.Scanner;

public class MarkersAndTeachers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initaializing the variables.
        int numOfMarkers, numOfTeachers;
        int markersLeft, markersPerTeacher;

        // Getting the input from the user.
        System.out.println("Please enter the number of markers: ");
        numOfMarkers = scanner.nextInt();

        System.out.println("Please enter the number of teachers: ");
        numOfTeachers = scanner.nextInt();

        // Checking for a scenario where the number of markers is less than the number of teachers.
        if (numOfMarkers < numOfTeachers) {
            System.out.println("There are only " + numOfMarkers + " markers and " + numOfTeachers + " teachers.\nThere aren't enough markers for everyone.");
        } else {
            // Calculating the number of markers that each teacher is going to get.
            markersPerTeacher = numOfMarkers / numOfTeachers;
            //Calculating the remainder of the markers in the package.
            markersLeft = numOfMarkers % numOfTeachers;
            System.out.println("Every teacher will get " + markersPerTeacher + " markers.");
            
            if (markersLeft == 1) {
                System.out.println("There is " + markersLeft + " markers left in the package.");
            } else if (markersLeft > 1) {
                System.out.println("There are " + markersLeft + " markers left in the package.");
            }
        }
    }
}
