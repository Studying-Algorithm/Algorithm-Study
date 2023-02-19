//import java.util.Arrays; -> 31번 사용하기 위함.
import java.util.Scanner;
public class BJ1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int sub_count = scanner.nextInt();
		scanner.nextLine();
		String numbers[] = scanner.nextLine().split(" ");
		
		int sub_arr[] = new int[sub_count];
		for(int i=0; i<sub_count; i++) {
			sub_arr[i] = Integer.parseInt(numbers[i]);
		}
		
		double sum = 0;
		for(int i=0; i<sub_arr.length; i++) {
			sum += sub_arr[i];
		}
		
		double M = sub_arr[0];
		for(int i=1; i<sub_arr.length; i++) {
			if(sub_arr[i] > M) {
				M = sub_arr[i];
			}
		}
		//Arrays.sort(sub_arr); -> 배열안에 있는 값들을 작은 순으로 재배치
		
		double result = sum / sub_count / M * 100;
		System.out.println(result);
	}
}