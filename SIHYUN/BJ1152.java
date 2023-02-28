import java.util.Scanner;
public class BJ1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine().trim().replaceAll("[ ]{2,}", " ");
		String arr[] = input.split(" ");
		
		if(arr[0] == "") {
			System.out.println(0);
		} else {
			System.out.println(arr.length);
		}
	}
}