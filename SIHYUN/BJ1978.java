import java.util.Scanner;
public class BJ1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int prime_count = n;
		
		for(int i=0; i<n; i++) {
			int n_number = scanner.nextInt();
			
			for(int j=2; j*j<=n_number; j++) {
				if(n_number % j == 0) {
					prime_count--; break;
				}
			}
			
			if(n_number == 1) {
				prime_count--;
			}
		}
		
		System.out.println(prime_count);
	}
}