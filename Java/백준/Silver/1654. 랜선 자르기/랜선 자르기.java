import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] lines;
    private static int maxValue = Integer.MAX_VALUE;
    private static int K,N;
    private static long result = 0;

    // 이분 탐색을 이용해 찾기
    static void find(long min, long max)   {
        long mid = (min+max) / 2;
        long cnt = 0;
        for(int i=0;i<K;i++)    {
            cnt += lines[i] / mid;
        }
        if(max < min)   {
            result = min;
            return;
        }
        if(result == mid)   {
            return;
        }
        result = mid;
        if(cnt < N) {
            find(min, mid);
        } else {
            find(mid+1, max);
        }
    }
    
    // Main Process
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        lines = new int[K];

        // 선의 길이 입력
        for(int i=0;i<K;i++)    {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            lines[i] = t;
        }
        find(1, maxValue);
        // 랜선의 길이는 Integer_MAX값보다 작음으로 해당 값부터 이분탐색 시작
        System.out.println(result-1);
    }
}