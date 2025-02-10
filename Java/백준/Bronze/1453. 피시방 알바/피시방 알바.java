import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[] chk = new int[101];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<loop;i++) {
            int want = Integer.parseInt(st.nextToken());
            if(chk[want] == 0)  {
                chk[want] = 1;
                continue;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}