import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb;
        int n1, n2, result;
        sb = new StringBuilder(st.nextToken());
        n1 = Integer.parseInt(sb.reverse()+"");
        sb = new StringBuilder(st.nextToken());
        n2 = Integer.parseInt(sb.reverse()+"");
        sb = new StringBuilder(n1+n2+"");
        result = Integer.parseInt(sb.reverse()+"");
        System.out.println(result);
    }
}