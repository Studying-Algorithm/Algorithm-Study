import java.util.Scanner;
public class BJ10951 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { //hasNextInt 입력된 값이 Int값일 경우 true를 반환한다~ 아니면 false를 반환합니다~
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
    }
}
