import java.util.Scanner;
public class BJ1330 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int b = p.nextInt();
        if (a > b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("==");
        } else if (a < b) {
            System.out.println("<");
        }
    }
}