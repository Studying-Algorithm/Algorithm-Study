import java.util.Scanner;
public class BJ3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int rectangle_x[] = new int[4];
		int rectangle_y[] = new int[4];
		
		for(int i=0; i<3; i++) {
			rectangle_x[i] = scanner.nextInt();
			rectangle_y[i] = scanner.nextInt();
		}
		
		if(rectangle_x[0] == rectangle_x[1]) {
			rectangle_x[3] = rectangle_x[2];
		} else if(rectangle_x[1] == rectangle_x[2]) {
			rectangle_x[3] = rectangle_x[0];
		} else {
			rectangle_x[3] = rectangle_x[1];
		}
		
		if(rectangle_y[0] == rectangle_y[1]) {
			rectangle_y[3] = rectangle_y[2];
		} else if(rectangle_y[1] == rectangle_y[2]) {
			rectangle_y[3] = rectangle_y[0];
		} else {
			rectangle_y[3] = rectangle_y[1];
		}
		
		System.out.println(rectangle_x[3] + " " + rectangle_y[3]);
	}
}