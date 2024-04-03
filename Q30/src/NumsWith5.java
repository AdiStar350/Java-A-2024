public class NumsWith5 {
    public static void main(String[] args) {
        // Printing all the numbers between 10 and 99 with the number 5.
        for(int i = 10; i <= 99; i += 5) {
            if(i % 10 == 5 || i / 10 == 5) {
                System.out.println(i);
            }
        }
    }
}
