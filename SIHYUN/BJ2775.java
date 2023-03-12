import java.util.Scanner;
public class BJ2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int apart[][] = new int[20][20];
		
		for(int i=0; i<apart.length; i++) {
			apart[0][i] = i + 1;
		}
		
		for(int i=1; i<apart.length; i++) {
			for(int j=0; j<apart[i].length; j++) {
				if(j == 0) {
					apart[i][j] = 1; // apart[i-1][j];
				} else {
					apart[i][j] = apart[i-1][j] + apart[i][j-1];
				}
			}
		}
		
		int output = scanner.nextInt();
		for(int i=0; i<output; i++) {
			int k = scanner.nextInt();
			int n = scanner.nextInt();
			
			System.out.println(apart[k][n-1]);
		}
	}
}