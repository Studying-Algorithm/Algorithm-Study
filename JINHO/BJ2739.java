import java.util.Scanner;
public class BJ2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int end = 9;
        for (int j = 1; j <= end; j++) {
            System.out.println(n+" * "+j+" = "+n * j);
        }
    }
}
