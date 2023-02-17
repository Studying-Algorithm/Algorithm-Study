import java.util.Scanner;
public class BJ2257 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt(); int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		// n1 * n2 * n3를 문자형을 변경, 배열에 저장
		String mul_arr[] = Integer.toString(n1 * n2 * n3).split("");
		
		// 정수형으로 변경하기 위해 mul_arr 길이만큼 새로운 배열
		int arr[] = new int[mul_arr.length];
		
		// 0~9까지 세는 것을 저장하기 위한 배열
		int count[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(mul_arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}
}