import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int team1 = 0;
    private static int team2 = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[5];
        int min = Integer.MAX_VALUE;
        int stop = 0;
        for(int i=0;i<5;i++)    {
            nums[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, nums[i]);
        }
        while(true) {
            stop = 0;
            for(int i=0;i<5;i++)    {
                if(min % nums[i] == 0) stop++;
            }
            if(stop >= 3) break;
            min++;
        }
        System.out.println(min);
    }
}