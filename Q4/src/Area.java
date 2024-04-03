import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h;

        System.out.println("Please enter the width of the rectangle:");
        w = sc.nextInt();

        System.out.println("Please enter the height of the rectangle:");
        h = sc.nextInt();

        int a = w * h;

        if (a > 100) {
            System.out.println("The area of the rectangle is " + a + " and is greater than 100.");
        } else {
            System.out.println("The area of the rectangle is " + a + " and is not greater than 100.");
        }
    }
}
