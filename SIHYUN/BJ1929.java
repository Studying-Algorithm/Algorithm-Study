import java.util.Scanner;
public class BJ1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		boolean prime_T_F;
		
		for(int i=M; i<=N; i++) {
			prime_T_F = true;
			
			if(i == 1) {
				prime_T_F = false;
			}
			for(int j=2; j*j<=i; j++) {
				if(i % j == 0) {
					prime_T_F = false; break;
				}
			}
			if(prime_T_F) {
				System.out.println(i);
			}
		}
	}
}