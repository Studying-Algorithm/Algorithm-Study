import java.util.Scanner;
public class BJ8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int case_count = scanner.nextInt();
		for(int i=0; i<case_count; i++) {
			String arr[] = scanner.next().split("");
			
			int result = 0; int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j].equals("O")) {
					if(j > 0 && arr[j-1].equals("O")) {
						count++;
						result += count + 1;
					} else {
						result++; count = 0;
					}
				}
			}
			System.out.println(result);
		}
	}
}