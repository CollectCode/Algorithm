import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] nums;
    private static int[] result;
    private static int N, cnt=1;

    // binary search
    static void process(int left, int right, int value)   {
        int mid = (left + right) / 2;
        if(left >= right) {
            if (result[mid-1] < value && result[mid] > value) result[mid] = value;
            return;
        }
        if(result[mid] > value) process(left, mid, value);
        else if(result[mid] < value) process(mid+1, right, value);
    }

    // Main Process
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        nums = new int[N+1];
        result = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            int t = Integer.parseInt(st.nextToken());
            nums[i] = t;
        }

        for(int i=1;i<=N;i++)   {
            if(result[cnt-1] == 0 || result[cnt-1] < nums[i])   {
                result[cnt++] = nums[i];
                continue;
            }
            process(1, cnt-1, nums[i]);
        }

        int total=0;
        for(int i=1;i<=N;i++)   {
            if(result[i] != 0)  {
                total++;
            }
        }

        System.out.println(total);
    }
}