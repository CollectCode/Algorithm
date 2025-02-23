import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        int result = 1;
        int[] ball = new int[4];
        ball[1] = 1;
        for(int i=0;i<loop;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int t = ball[x];
            ball[x] = ball[y];
            ball[y] = t;
        }

        for(int i=1;i<=3;i++) {
            if(ball[i] == 1) result = i;
        }

        System.out.println(result);
    }
}