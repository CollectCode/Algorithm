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
    private static ArrayList<Integer> times = new ArrayList<>();
    private static int[] result = new int[1001];

    public static void main(String args[]) throws IOException {
        int loop = Integer.parseInt(br.readLine());
        int realres = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<loop;i++) {
            times.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(times, (t1, t2) -> t1 - t2);
        result[0] = times.get(0);
        
        for(int i=1;i<loop;i++) {
            result[i] += result[i-1]+times.get(i);
        }

        for(int i=0;i<loop;i++) {
            realres += result[i];
        }

        System.out.println(realres);
    }
}