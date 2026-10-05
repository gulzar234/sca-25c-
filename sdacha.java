import java.util.Scanner;

public class sdacha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int price = a * 100 + b;
        int paid = c * 100 + d;

        int change = paid - price;

        System.out.println(change / 100 + " " + change % 100);
    }
}