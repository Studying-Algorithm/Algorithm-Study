// 꼭 다시 풀어봐야할 문제

import java.util.Scanner;
public class BJ2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		long V = scanner.nextLong();
		
		/* 방법1
		long how_much = 0;
		long day_count = 0;
		
		for(int i=1; true; i++) {
			how_much += A;
			day_count++;
			if(how_much >= V) {
				System.out.println(day_count); break;
			} else {
				how_much -= B;
			}
		}
		*/
		
		// 방법2
		long remain = V - A; // 낮에 올라가서 남은 거리
		long move = A - B; // 하루에 총 올라간 거리
		long count = remain / move; // 나무를 하루동안으로하여 최대로 올라갈 수 있는 횟수
		
		// 횟수가 딱 떨어지면, 횟수만큼 / 나머지가 남으면, 한번더
		// 하지만, remain 에서 낮에 올라갈 수 있는 거리를 뺐기에 +1 / +2 각각 해주면 된다.
		if(remain % move >= 1) {
			System.out.println(count + 2);
		} else {
			System.out.println(count + 1);
		}
	}
}