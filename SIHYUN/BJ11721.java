import java.util.Scanner;
public class BJ11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String input_string = scanner.next();
		
		String saved = ""; int saved_count = 0;
		for(int i=0; i<input_string.length(); i++) {
			saved += input_string.charAt(i);
			saved_count++;
			
			if(saved_count == 10) {
				saved += "\n";
				saved_count = 0;
			}
		}
		
		System.out.println(saved);
	}
}