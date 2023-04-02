import java.util.Arrays;
import java.util.Scanner;
public class BJ11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int timeout_arr[] = new int[n];
		for(int i=0; i<timeout_arr.length; i++) {
			timeout_arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(timeout_arr);
		
		int total = 0; int temp = 0;
		for(int i=0; i<timeout_arr.length; i++) {
			int index = temp + timeout_arr[i];
			total += index;
			temp = index;
		}
		
		System.out.println(total);
	}
}