import java.util.Scanner;
public class BJ10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.next();
		
		for(int i=97; i<=122; i++) {
			System.out.println(S.indexOf(i));
		}
	}
}