import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        for(int i=0;i<loop;i++) {
            int result = 0;
            st = new StringTokenizer(br.readLine());
            int loop2 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<loop2;j++)   {
                result += Integer.parseInt(st.nextToken());
            }
            System.out.println(result);
        }
    }
}