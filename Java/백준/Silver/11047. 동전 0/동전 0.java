import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int coin[] = new int[11];

    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int coins = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int result = 0;

        for(int i=0;i<coins;i++)    {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for(int i=coins-1;i>=0;i--) {
            if(coin[i] > money) {
                continue;
            } else if(coin[i] <= money) {
                int t = money/coin[i];
                int value = t*coin[i];
                money -= value;
                result+=t;
            }
        }
        System.out.println(result);
    }
}