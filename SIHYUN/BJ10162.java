import java.util.Scanner;
public class BJ10162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		int A_count = 0; int B_count = 0; int C_count = 0;
		while(true) {
			if(T == 0) {
				System.out.println(A_count);
				System.out.println(B_count);
				System.out.println(C_count); break;
			} 
			
			if(T >= 300) {
				T -= 300;
				A_count++;
			} else if(T >= 60) {
				T -= 60;
				B_count++;
			} else if(T >= 10) {
				T -= 10;
				C_count++;
			} else {
				System.out.println("-1"); break;
			}
		}
	}
}