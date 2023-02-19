import java.util.Scanner;
public class BJ4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt(); scanner.nextLine();
		
		for(int i=0; i<c; i++) {
			String input_arr[] = scanner.nextLine().split(" ");
			
			double total = 0;
			int arr[] = new int[input_arr.length];
			arr[0] = Integer.parseInt(input_arr[0]);
			for (int j=1; j<input_arr.length; j++) {
				arr[j] = Integer.parseInt(input_arr[j]);
				total += arr[j];
			}
			
			double avg = total / arr[0];
			
			double student_good = 0;
			for(int j=1; j<arr.length; j++) {
				if(arr[j] > avg) {
					student_good++;
				}
			}
			
			double stu_avg = student_good / arr[0] * 100;
			String result = String.format("%.3f", stu_avg);
			System.out.println(result+"%");
		}	
	}
}