import java.util.Scanner;
public class BJ2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// 방을 넓게 잡아주기 ( 모눈종이 )
		int map[][] = new int[100][100];
		int n = scanner.nextInt(); // 색종이 개수 입력받기
		
		int area = 0; // 검정색의 영역의 넓이를 저장하는 변수
		
		// 색종이의 개수만큼 x, y 좌표 입력받기
		for(int i=0; i<n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			// 입력받은 x, y 좌표 토대로 최대 +10 길이까지 +1씩 증가하여 2차원배열에 넓이 '1' 저장하기
			for(int j=y; j<y+10; j++) {
				for(int k=x; k<x+10; k++) {
					map[j][k] = 1;
				}
			}
		}
		
		// 모눈종이에 있는 칸들을 전부 분석하여 색이 칠해진 (값이 '1')인 칸이 있다면, 넓이를 저장하는 변수에 +1 하기
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map.length; j++) {
				if(map[i][j] == 1) {
					area++;
				}
			}
		}
		
		// 검정색 넓이 출력하기
		System.out.println(area);
	}
}