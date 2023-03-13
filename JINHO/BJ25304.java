import java.util.Scanner;
public class BJ25304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = 0; i < b; i++) {
            int c = in.nextInt();
            int d = in.nextInt();
            int e = c*d;
            sum += e;
        }
        if (a == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
