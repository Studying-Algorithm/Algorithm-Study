import java.util.Arrays;
import java.util.Scanner;
public class BJ2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		boolean repeat_T_F;
		for(int i=0; i<arr.length; i++) {
			repeat_T_F = true;
			if(i>0 && arr[i] == arr[i - 1]) {
				repeat_T_F = false;
			}
			
			if(repeat_T_F) {
				System.out.println(arr[i]);
			}
		}
	}
}