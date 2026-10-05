import java.util.Scanner;

public class hardu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a == 0 && b == 0) {
            if (c == 0) {
                System.out.println("NO");
            } else {
                System.out.println("INF");
            }
        } else if (a == 0) {
            System.out.println("NO");
        } else {
            int x = -b / a;

            if (-b % a != 0) {
                System.out.println("NO");
            } else if (c * x + d == 0) {
                System.out.println("NO");
            } else {
                System.out.println(x);
            }
        }
    }
}