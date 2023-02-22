import java.util.Scanner;
public class BJ1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		long fixed_cost = scanner.nextLong(); // 고정비용
		long variable_cost = scanner.nextLong(); // 가변비용
		long fixed_price = scanner.nextLong(); // 판매가격
		
		// 방법1
		/*
		int count = 0;
		if(variable_cost >= fixed_price) {
			count -= 1;
		} else {
			for(int i=1; true; i++) {
				if(variable_cost * i + fixed_cost < fixed_price * i) {
					count += i; break;
				}
			}
		}
		
		System.out.println(count);
		*/
		
		
		// 방법2
		if(variable_cost >= fixed_price) {
			System.out.println("-1");
		} else {
			System.out.println((fixed_cost / (fixed_price-variable_cost))+1);
		}
	}
}