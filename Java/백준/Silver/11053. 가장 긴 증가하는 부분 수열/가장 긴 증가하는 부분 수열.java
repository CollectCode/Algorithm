import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int[] nums = new int[1010];
    private static int[] node = new int[1010];
    private static int maxlen = 0;
    private static int loop;
    public static void main(String args[]) throws IOException {
        loop = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= loop; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            node[i] = 1;
        }
        
        if(nums[2] > nums[1])   {
            node[2] = node[1]+1;
        } else  {
            node[2] = node[1];
        }

        for(int i=3;i<=loop;i++)    {
            int tmax=1;
            for(int j=1;j<=i;j++)    {
                if(nums[i] > nums[j])   {
                    if(node[j] >= tmax)    {
                        tmax = node[j]+1;
                    }
                }
            }
            node[i] = tmax;
        }

        for(int i=1;i<=loop;i++)    {
            maxlen = Math.max(maxlen, node[i]);    
        }

        System.out.println(maxlen);
    }
}