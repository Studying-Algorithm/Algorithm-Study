import java.util.Scanner;

public class BJ2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) { // a가 b보다 작을 경우
            int temp = b; // a와 b의 위치 바꿔줌
            b = a;
            a = temp;
        }
        int result = gcd(a, b);
        System.out.println(result); // 최대공약수
        System.out.println(a * b / result); // 최소공배수
    }

    public static int gcd(int a, int b) { // 최대공약수 구하는 함수
        if (a % b == 0) { // a / b를 했을 때 나머지가 0이라면
            return b; // b 리턴 (최대공약수)
        }
        return gcd(b, a % b); // 아닐 때 재귀함수로 0이 될 때까지 나눠줌
    }
}