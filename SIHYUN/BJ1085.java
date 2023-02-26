import java.util.Scanner;
public class BJ1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String input[] = scanner.nextLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int w = Integer.parseInt(input[2]);
		int h = Integer.parseInt(input[3]);
		
		int x1 = x - 0; int x2 = w - x;
		int y1 = y - 0; int y2 = h - y;
		
		int process_1 = Math.min(x1, x2);
		int process_2 = Math.min(y1,  y2);
		
		int result = Math.min(process_1, process_2);
		System.out.println(result);
	}
}