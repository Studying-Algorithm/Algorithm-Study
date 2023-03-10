import java.util.Scanner;
public class BJ27866 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int b = in.nextInt();
        char c = a.charAt(b-1);
        System.out.println(c);
    }
}
