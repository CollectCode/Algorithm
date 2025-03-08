import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int loop, maxValue=501;
    private static int[][] dp = new int[maxValue][maxValue];
    private static int[] sum = new int[maxValue];
    private static int[] arr = new int[maxValue];

    // Initialize
    public static void init()   {
        for(int i=1;i<maxValue;i++)  {
            sum[i] = 0;
            for(int j=1;j<maxValue;j++) {
                dp[i][j] = 0;
            }
        }
    }

    // Calculating
    public static int Cal(int start, int end)    {
        if(start >= end) return 0; // 시작 >= 끝 일때 0 반환
        if(dp[start][end] != 0) return dp[start][end]; // dp[start][end]에 값이 있을때 해당값 반환
        if(start+1 == end) return arr[start] + arr[end]; // 시작과 끝이 바로 옆(이웃)에 있을때
        
        // 위 3가지 모두 해당하지 않으면 dp[start][end]값 구하기
        dp[start][end] = Integer.MAX_VALUE;

        // 분할정복 느낌으로 하향 점화식을 이용해 dp[start][end]값 구하기
        for(int i=start;i<=end;i++) {
            // 누적합은 결국 좌,우값을 더하게 됨으로 좌 최소값(Cal(start, i), 우 최소값(Cal(i+1, end)을 구하고
            // 마지막 합(sum[end])과 범위에 해당하지 않는 누적합(sum[start-1])을 뺀다.
            int tmp = Cal(start, i) + Cal(i+1, end) + sum[end] - sum[start-1];
            dp[start][end] = Math.min(dp[start][end], tmp);
        }

        return dp[start][end];
    }

    // Main Process
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        loop = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= loop; i++) {
            init();
            st = new StringTokenizer(br.readLine());
            int loop2 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=loop2;j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum[j] = sum[j-1] + arr[j];
            }
            System.out.println(Cal(1, loop2));
        }
    }
}