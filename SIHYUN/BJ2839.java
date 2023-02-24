import java.util.Scanner;
public class BJ2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int three = 0;
		for(int i=0; true; i++) {
			if(N % 5 == 0) {
				System.out.println(N / 5 + three); break;
			} else if(N >= 3) {
				three++; N -= 3;
			} else {
				System.out.println("-1"); break;
			}
		}
	}
}