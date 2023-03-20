import java.util.Scanner;
public class BJ2480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = 0;
        if (a == b) {
            if (b == c) {
                sum = 10000;
                sum += a * 1000;
                System.out.println(sum);
            } else if (!(b == c)) {
                sum = 1000;
                sum += a * 100;
                System.out.println(sum);
            }
        } else if (b == c) {
            if (a == b) {
                sum = 10000;
                sum += a * 1000;
                System.out.println(sum);
            } else if (!(a == b)) {
                sum = 1000;
                sum += b * 100;
                System.out.println(sum);
            }
        } else if (c == a) {
            if (c == b) {
                sum = 10000;
                sum += a * 1000;
                System.out.println(sum);
            } else if (!(c == b)) {
                sum = 1000;
                sum += a * 100;
                System.out.println(sum);
            }
        } else {
            if (a >= b && a >= c) {
                System.out.println(a*100);
            } else if (b >= a && b >= c) {
                System.out.println(b*100);
            } else {
                System.out.println(c*100);
            }
        }
    }
}
