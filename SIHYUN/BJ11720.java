import java.util.Scanner;
public class BJ11720 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String arr[] = scanner.next().split("");
		
		int result = 0;
		
		for(int i=0; i<count; i++) {
			result += Integer.parseInt(arr[i]);
		}
		
		System.out.println(result);
	}
}