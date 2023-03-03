import java.util.Scanner;

public class BJ3460 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int T = scanner.nextInt();

         for (int i = 0; i < T; i++) {
             int n = scanner.nextInt();
             String binary = Integer.toBinaryString(n);
             char[] binaryArr = binary.toCharArray();

             int num = 0;
             for (int j = binaryArr.length - 1; j >= 0; j--) {
                 if (binaryArr[j] == '1') {
                     System.out.print(num + " ");
                 }
                 num++;
             }
         }
    }
}
