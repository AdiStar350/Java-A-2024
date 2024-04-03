import java.util.Scanner;

public class CanBuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 3;
        int quantity, total, cash;

        // I sell Lemonade for 3$ a cup.
        System.out.println("How many cups do you want to buy?");
        quantity = sc.nextInt();

        total = quantity * price;

        System.out.println("How much cash do you have?");
        cash = sc.nextInt();

        if (total > cash) {
            System.out.println("The total is " + total + ". " + cash + " is not enough to buy this. Sorry.");
        } else {
            System.out.println("The total is " + total + ". There you go! Have a great day.");
        }
    }
}
