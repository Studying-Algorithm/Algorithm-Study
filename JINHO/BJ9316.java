import java.util.Scanner;
public class BJ9316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(String.format("Hello World, Judge %d!", (i+1)));
        }
    }
}
