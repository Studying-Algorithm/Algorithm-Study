import java.util.Scanner;
public class BJ25314 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int by = n.nextInt();
        StringBuilder a = new StringBuilder("");
        for (int i = 4; i <= by; i += 4) {
            a.append("long ");
        }
        System.out.println(a+"int");
    }
}
