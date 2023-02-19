import java.util.Scanner;

public class BJ2588 {
    public static void main(String[] args) {
        // 곱셈
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        char[] b_arr = b.toCharArray();

        System.out.println(Integer.parseInt(a) * Character.getNumericValue(b_arr[2]));
        System.out.println(Integer.parseInt(a) * Character.getNumericValue(b_arr[1]));
        System.out.println(Integer.parseInt(a) * Character.getNumericValue(b_arr[0]));
        System.out.println(Integer.parseInt(a) * Integer.parseInt(b));

    }
}
