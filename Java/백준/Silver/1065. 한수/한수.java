import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[1001];
        int num = Integer.parseInt(st.nextToken());
        for(int i=1;i<=1000;i++) {
            if (i < 100) {
                nums[i] = nums[i - 1] + 1;
                continue;
            }
            int one = i%10;
            int ten = i%100/10;
            int hundred = i/100;
            if(hundred-ten == ten-one) nums[i] = nums[i-1]+1;
            else nums[i] = nums[i-1];
        }
        System.out.println(nums[num]);
    }
}