import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int[] nums = new int[100010];
    private static int max = -1001;
    private static int temp = 0;
    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<loop;i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<loop;i++) {
            temp += nums[i];
            if(temp>max) max = temp;
            if(temp<0)    {temp=0;}
        }
        System.out.println(max);
    }
}