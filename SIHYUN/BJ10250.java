import java.util.Scanner;
public class BJ10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for(int t=0; t<T; t++) {
			int H = scanner.nextInt();
			int W = scanner.nextInt();
			int N = scanner.nextInt();
			
			String arr[][] = new String[H][W];
				
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					int index_1 = i+1;
					String floor = Integer.toString(index_1);
					String room = "";
					
					if(j>=9) {
						int index_2 = j+1;
						room += Integer.toString(index_2);
					} else {
						int index_2 = j+1;
						room += "0" + Integer.toString(index_2);
					}
					arr[i][j] = floor + room;
				}
			}
			
			int count = 0;
			for(int i=0; i<W; i++) {
				for(int j=0; j<H; j++) {
					count++;
					if(count == N) {
						System.out.println(arr[j][i]); break;
					}
				}
			}
		}
	}
}