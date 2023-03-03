import java.util.Scanner;

// BJ9085번 더하기
public class BJ9085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum;
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            sum = 0;
            for (int j = 0; j < N; j++) {
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
