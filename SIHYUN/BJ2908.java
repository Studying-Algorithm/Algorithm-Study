import java.util.Scanner;
public class BJ2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String input_num[] = scanner.nextLine().split(" ");
		
		String arr_n1[] = input_num[0].split("");
		String arr_n2[] = input_num[1].split("");
		
		String n1 = "";
		for(int i=arr_n1.length-1; i>=0; i--) {
			n1 += arr_n1[i];
		}
		
		String n2 = "";
		for(int i=arr_n2.length-1; i>=0; i--) {
			n2 += arr_n2[i];
		}
		
		int result = 0;
		if(Integer.parseInt(n1) > Integer.parseInt(n2)) {
			result += Integer.parseInt(n1);
		} else {
			result += Integer.parseInt(n2);
		}
		
		System.out.println(result);
	}
}