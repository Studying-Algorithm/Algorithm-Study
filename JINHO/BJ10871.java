import java.util.Scanner;
public class BJ10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int n = in.nextInt();
        int[] value = new int[c];
        for (int i = 0; i < value.length; i++) {
            value[i] = in.nextInt();
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i] < n) {
                System.out.printf(value[i]+" ");
            }
        }
    }
}
