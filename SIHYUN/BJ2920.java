import java.util.Scanner;
public class BJ2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[8];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int a = 1; int d = 8; int a_count = 0; int d_count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == a) {
				a_count++;
			} else if(arr[i] == d) {
				d_count++;
			}
			
			a++; d--;
		}
		
		if(a_count == 8) {
			System.out.println("ascending");
		} else if(d_count == 8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}