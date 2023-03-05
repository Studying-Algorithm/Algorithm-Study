import java.util.Scanner;
import java.util.HashMap;
public class BJ1620 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		HashMap<String, Integer> pokemon1 = new HashMap<>();
		HashMap<Integer, String> pokemon2 = new HashMap<>();
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		for(int i=1; i<N+1; i++) {
			String poke_name = scanner.next();
			pokemon1.put(poke_name, i);
			pokemon2.put(i, poke_name);
		}
		
		for(int i=0; i<M; i++) {
			String search = scanner.next();
			if(search.charAt(0) >= 65 && search.charAt(0) <= 90) {
				System.out.println(pokemon1.get(search));
			} else if(search.charAt(0) >= 49 && search.charAt(0) <= 57) {
				System.out.println(pokemon2.get(Integer.parseInt(search)));
			}
		}
	}
}