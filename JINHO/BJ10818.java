import java.util.Arrays;
import java.util.Scanner;
public class BJ10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = in.nextInt();
        }
        Arrays.sort(b);
        System.out.println(b[0]);
        System.out.println(b[b.length - 1]);
    }
}
