import java.util.Scanner;
public class BJ10870_DP {

	public static int fibo(int number) {
		if(number <= 1) {
			return number;
		}
		
		return fibo(number-1) + fibo(number-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		System.out.println(fibo(n));
	}
}