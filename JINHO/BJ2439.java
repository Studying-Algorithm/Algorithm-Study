import java.util.Scanner;
public class BJ2439 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }
    }
}
