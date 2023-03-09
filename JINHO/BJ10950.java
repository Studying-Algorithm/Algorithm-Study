import java.util.Scanner;
public class BJ10950 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int c = in.nextInt();
            int[] value = new int[c];
            for (int i = 0; i < value.length; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                value[i] = a+b;
            }
            for (int i = 0; i < value.length; i++) {
                System.out.println((value[i]));
            }
        }
}