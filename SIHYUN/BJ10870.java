import java.util.Scanner;
public class BJ10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int arr[] = new int[n+1];
		
		for(int i=0; i<arr.length; i++) {
			if(i == 0 || i == 1) {
				arr[i] = 0+i;
			} else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		
		System.out.println(arr[n]);
	}
}