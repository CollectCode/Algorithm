import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n, m;
    private static int chk[] = new int[9];
    private static StringBuilder sb = new StringBuilder();
    private static void process(int x) {
        if(x>m) {
            System.out.println(sb.toString().trim());
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (chk[i] == 0) {
                chk[i] = 1;
                sb.append(i + " ");
                process(x + 1);
                sb.setLength(sb.length()-2);
                chk[i] = 0;
            }
        }
    }

    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        process(1);
    }
}