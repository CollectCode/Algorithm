import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static long N, K;

    private static long search(long left, long right)   {
        if(left > right) return left;

        long mid = (left + right) / 2;
        long cnt = 0;

        for(int i=1;i<=N;i++)   {
            if(mid / i < N) {
                cnt += mid/i;
            } else {
                cnt += N;
            }
        }

        if(cnt < K) {
            return search(mid+1, right);
        } else {
            return search(left, mid - 1);
        }
    }

    // Main Process
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        K = Long.parseLong(st.nextToken());
        System.out.println(search(1, K));
    }
}