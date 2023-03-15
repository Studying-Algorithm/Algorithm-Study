import java.util.Scanner;
public class BJ10952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(a+b);
        }
    }
}
