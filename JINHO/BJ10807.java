import java.util.Scanner;
public class BJ10807 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int all = n.nextInt();
        int[] value = new int[all];
        for (int i = 0; i < value.length; i++) {
            int a = n.nextInt();
            value[i] = a;
        }
        int aa = n.nextInt();
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            if (aa == value[i]) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
