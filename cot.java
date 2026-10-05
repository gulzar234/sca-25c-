import java.util.Scanner;

public class cot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int sides = n * 2;
        int time = (sides + k - 1) / k * m;

        System.out.println(time);
    }
}
