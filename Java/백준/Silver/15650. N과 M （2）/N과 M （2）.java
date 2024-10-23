import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n, m;
    private static StringBuilder sb = new StringBuilder("");
    private static int chk[] = new int[9];
    private static int inp[] = new int[9];

    private static void process(int dep, int loc) {
        if (dep == m) {
            for (int i = 0; i < m; i++) {
                sb.append(inp[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = loc; i <= n; i++) {
            if (chk[i] == 0) {
                inp[dep] = i;
                chk[i] = 1;
                process(dep + 1, i);
                chk[i] = 0;
            }
        }
    }

    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        process(0,1);
        System.out.println(sb);
    }
}