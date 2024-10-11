import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int num;
    private static int count;
    private static String str = "";
    private static StringBuilder sb = new StringBuilder(str);
    private static void process(int n, int st, int mid, int de) {
        count++;
        if(n==1)    {
            sb.append(st + " " + de + "\n");
            return;
        }
        process(n-1, st, de, mid);
        sb.append(st + " " + de + "\n");
        process(n-1, mid, st, de);
    }
    public static void main(String args[]) throws IOException {
        num = Integer.parseInt(br.readLine());
        process(num, 1, 2, 3);
        bw.write(count+"\n"+sb+"");
        bw.flush();
        bw.close();
    }
}