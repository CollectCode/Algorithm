import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] woods;
    private static int N,M;
    private static int maxValue = 2000000000;
    private static long temp, result, cnt=0;

    // 이분 탐색 시작
    static void find(long min, long max)  {
        long mid = (min+max)/2;
        for(int i=0;i<N;i++)    {
            if(woods[i] > mid) {
                cnt += woods[i] - mid;
            }
        }
        if(max < min)   {
            result = min;
            return;
        }
        if(cnt == M)   {
            result = mid;
            return;
        }
        if(cnt > M) {
            temp = mid;
        }
        if(result == mid && M != cnt)   {
            result = temp;
            return;
        }
        result = mid;
        if(cnt < M) {
            cnt = 0;
            find(min, mid);
        } else {
            cnt = 0;
            find(mid+1, max);
        }
    }

    // Main Process
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        woods = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)    {
            woods[i] = Integer.parseInt(st.nextToken());
        }
        find(0, maxValue);
        System.out.println(result);
    }
}