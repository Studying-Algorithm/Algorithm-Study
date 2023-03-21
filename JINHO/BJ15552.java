import java.io.*;
import java.util.StringTokenizer;
public class BJ15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer z;

        int a = Integer.parseInt(in.readLine());
        for (int i = 0; i < a; i++) {
            z = new StringTokenizer(in.readLine());
            out.write((Integer.parseInt(z.nextToken())+Integer.parseInt(z.nextToken()))+"\n");
        }
        out.close();
    }
}
