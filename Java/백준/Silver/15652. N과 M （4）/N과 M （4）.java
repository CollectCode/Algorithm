import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n, m;
    private static StringBuilder sb = new StringBuilder("");
    private static int inp[] = new int[10];
    private static int chk[] = new int[10];
    private static void process(int dep) {
        if (dep == m) {
            for (int i = 0; i < m; i++) {
                sb.append(inp[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(dep==0)  {
                inp[dep]=i;
                process(dep+1);
            }
            else if(inp[dep-1]<=i) {
                inp[dep]=i;
                process(dep+1);
            }
        }
    }
    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        process(0);
        System.out.println(sb);
    }
}