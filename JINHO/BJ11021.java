import java.util.Scanner;
public class BJ11021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        int c = 0;
        int d = 0;
        for (int i = 0; i < a; i++) {
            c = in.nextInt();
            d = in.nextInt();
            b[i] = c+d;
        }
        for (int i = 1; i < a+1; i++) {
            System.out.println("Case #" + i + ": " + b[i-1]);
        }
    }
}
