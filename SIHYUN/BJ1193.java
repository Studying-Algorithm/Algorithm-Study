import java.util.Scanner;
public class BJ1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int count = N-1;
		int x = 1; int y = 1;
		
		while(count > 0) {
			if(x == 1) {
				if(y >= 1) {
					y++; count--;
					int y_count = y;
					if(count > 0) {
						for(int i=0; i<y_count-1; i++) {
							x++; y--; count--;
							if(count == 0) { break; }
						}
					}
				}
			}
			
			else if(y == 1) {
				if(x >= 1) {
					x++; count--;
					int x_count = x;
					if(count > 0) {
						for(int i=0; i<x_count-1; i++) {
							x--; y++; count--;
							if(count == 0) { break; }
						}
					}
				}
			}
		}
		
		System.out.println(x + "/" + y);
	}
}