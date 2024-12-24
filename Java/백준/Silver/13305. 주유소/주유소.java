import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static StringBuilder sb;

    public static void main(String args[]) throws IOException {
        long result = 0;
        int city = Integer.parseInt(br.readLine());
        long[] range = new long[city-1];
        long[] cost = new long[city];
        long min;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<city-1;i++)   {
            range[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<city;i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }
        result += range[0] * cost[0];
        min = cost[0];
        for(int i=1;i<city-1;i++) {
            if(min > cost[i])   {
                min = cost[i];
            }
            result += range[i] * min;
        }

        System.out.println(result);
    }
}