import java.util.Scanner;

public class BJ11718 {
    // BJ11718 - 그대로 출력하기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}

