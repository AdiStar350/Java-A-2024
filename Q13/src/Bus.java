public class Bus {
    public static void main(String[] args) {
        // Declaring and initializing variables.
        int students = 25; // -> Students in each class.
        int teachers = 1; // -> Teachers in each class.
        int classes = 7; // -> Classes in the trip.
        int busSeats = 40; // -> Bus seats in each bus.
        int bus; // -> Total number of buses.
        int empty; // -> Empty seats left.

        // Calculating the total number of people in the trip.
        int totalPeople = (students + teachers) * classes;

        if (totalPeople % busSeats == 0) {
            // Calculating the total number of buses.
            bus = totalPeople / busSeats;
            // Printing the number of buses.
            System.out.println("The number of buses is " + bus + ".");
        } else {
            // Calculating the total number of buses.
            bus = (totalPeople / busSeats) + 1;
            // Calculating the number of empty seats left.
            empty = 40 - (totalPeople % busSeats);
            // Printing the number of buses.
            System.out.println("The number of buses is " + bus + ".");
            // Printing the number of empty seats that are left.
            System.out.println("The number of empty seats left is " + empty + ".");
        }
    }
}
