import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int[] nums = new int[1010];
    private static int[] fornode = new int[1010];
    private static int[] backnode = new int[1010];
    private static int maxvalue = 0;
    private static int loop;
    public static void main(String args[]) throws IOException {
        loop = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<loop;i++) { 
            nums[i] = Integer.parseInt(st.nextToken());
            fornode[i] = 1;
            backnode[i] = 1;
        }

        for(int i=1;i<=loop;i++) {  
            int tm = 1;
            for(int j=0;j<=i;j++) {
                if(nums[i] > nums[j] && fornode[j]+1 >= tm)   {
                    tm = fornode[j]+1;
                }
            }
            fornode[i] = tm;
        }

        for(int i=loop-1;i>=0;i--)  {
            int tm = 1;
            for(int j=loop-1;j>=i;j--)   {
                if(nums[i] > nums[j] && backnode[j]+1 > tm)   {
                    tm = backnode[j]+1;
                }
            }
            backnode[i] = tm;
        }

        for(int i=0;i<=loop-1;i++) {
            for(int j=i;j<=loop-1;j++) {
                if(i == j || nums[i] == nums[j])  { 
                    int t;
                    t = Math.max(fornode[i], backnode[j]);
                    maxvalue = Math.max(t, maxvalue);
                    continue;
                } 
                maxvalue = Math.max(maxvalue, fornode[i] + backnode[j]);
            }
        }

        System.out.println(maxvalue);
    }
}