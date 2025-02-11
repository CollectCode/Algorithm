import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int minus = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int tminus = (3 * (i+1)) + minus;
            while(tminus > 0) {
                if(c < 'A') {
                    c = 'Z';
                }
                c--;
                tminus--;
            }
            if(c < 'A') {
                c = 'Z';
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}