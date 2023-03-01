import java.util.Scanner;
public class BJ2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		for(int i=0; i<T; i++) {
			String result = "";
			int R = scanner.nextInt();
			String S[] = scanner.next().split("");
			
			for(int j=0; j<S.length; j++) {
				for(int k=0; k<R; k++) {
					result += S[j];
				}
			}
			System.out.println(result);
		}
	}
}