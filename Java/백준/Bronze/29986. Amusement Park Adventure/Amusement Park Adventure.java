import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        int tall = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[] able = new int[loop];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<loop;i++) {
            able[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<loop;i++) {
            if(able[i] <= tall) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}