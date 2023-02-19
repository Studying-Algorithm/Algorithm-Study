import java.util.Scanner;

public class BJ10818 {
    // 최소, 최대
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println(min + " " + max);
    }
}
