import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder b = new StringBuilder();

        int c = Integer.parseInt(a.readLine());
        for (int i = 0; i < c; i++) {
            String tmp = a.readLine();
            b.append(tmp.charAt(0)).append(tmp.charAt(tmp.length()-1)).append("\n");
        }
        System.out.println(b);
    }
}
