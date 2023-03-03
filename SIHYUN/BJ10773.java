import java.util.Scanner;
import java.util.Stack;
public class BJ10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int K = scanner.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<K; i++) {
			int N = scanner.nextInt();
			
			if(i > 0 && N == 0) {
				stack.pop();
			} else {
				stack.push(N);
			}
		}
		
		int result = 0; int count = stack.size();
		for(int i=0; i<count; i++) {
			result += stack.pop();
		}
		
		System.out.println(result);
	}
}