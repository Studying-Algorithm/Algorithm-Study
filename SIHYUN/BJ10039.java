import java.util.Scanner;
public class BJ10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int stu_total = 0;
		for(int i=0; i<5; i++) {
			int stu = scanner.nextInt();
			if(stu < 40) {
				stu = 40;
				stu_total += stu;
			} else {
				stu_total += stu;
			}
		}
		
		System.out.println(stu_total / 5);
	}
}