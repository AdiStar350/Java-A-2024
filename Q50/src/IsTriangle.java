public class IsTriangle {
    public static void main(String[] args) {
        // Declaring the variables.
        int side1, side2, side3; // -> The sides of the triangle each one between 1 - 100.
        int count = 0; // How many triangles are valid.

        // Getting 10 triangles with 3 random sides.
        for (int i = 0; i < 10; i++) {
            side1 = (int)(Math.random() * 100 + 1);
            side2 = (int)(Math.random() * 100 + 1);
            side3 = (int)(Math.random() * 100 + 1);

            // Checking and printing if the triangle is valid.
            if ((side1 + side2 > side3) && 
                (side2 + side3 > side1) &&
                (side1 + side3 > side2)) {
                System.out.println("Triangle: " + side1 + ", " + side2 + ", " + side3 + " is a valid triangle.");
                count++;
            } else {
                System.out.println("Triangle: " + side1 + ", " + side2 + ", " + side3 + " is not a valid triangle.");
            } 
        }

        System.out.println("There are " + count + " valid, and " + (10 - count) + " invalid triangles.");
    }
}
