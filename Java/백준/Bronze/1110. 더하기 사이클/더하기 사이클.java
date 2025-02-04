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
        int def = Integer.parseInt(st.nextToken());
        int change = def;
        int cnt = 0;
        while(true) {
            int fw = change/10;
            int bw = change%10;
            int sum = fw+bw;
            if(sum >= 10) sum %= 10;
            change = sum+(bw*10);
            cnt++;
            if(change == def)   break;
        }
        System.out.println(cnt);
    }
}