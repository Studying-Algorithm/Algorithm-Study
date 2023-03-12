import java.util.Scanner;
public class BJ9498 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (a < 60) {
                System.out.println("F");
            } else if (a < 70) {
                System.out.println("D");
            } else if (a < 80) {
                System.out.println("C");
            } else if (a < 90) {
                System.out.println("B");
            } else if (a <= 100) {
                System.out.println("A");
            }
        }
    }
