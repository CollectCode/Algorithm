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
    private static StringBuilder sb = new StringBuilder("");
    private static int loop;
    private static int divnum;
    
    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        loop = Integer.parseInt(st.nextToken());
        divnum = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] map = new long[loop+1];
        long[] count = new long[divnum];

        for(int i=0;i<loop;i++) {
            map[i] = Long.parseLong(st.nextToken());
        }

        for(int i=1;i<loop;i++) {
            map[i] += map[i-1];
        }

        for(int i=0;i<loop;i++) {
            long num = map[i]%divnum;
            count[(int)num]++;
        }

        long result = count[0];

        for(int i=0;i<divnum;i++) {
            result += count[i]*(count[i]-1)/2;
        }

        System.out.println(result);
    }
}