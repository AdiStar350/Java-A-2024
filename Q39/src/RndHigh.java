public class RndHigh {
    public static void main(String[] args) {
        // Declaring the variables.
        int high = 0;

        // Getting 10 random numbers between 1 and 100.
        for(int i = 1; i <= 10; i++) {
            int num = (int) (Math.random() * 100) + 1;

            // Printing the number.
            System.out.println("Number: " + num);

            // Getting the highest number.
            if(high < num) {
                high = num;
            }
        }

        // Printing the highest number.
        System.out.println("The highest number: " + high);
    }
}
