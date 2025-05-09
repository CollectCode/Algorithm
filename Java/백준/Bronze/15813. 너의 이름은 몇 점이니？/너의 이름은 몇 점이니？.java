import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int result = 0;
        String str = br.readLine();
        for(int i=0;i<str.length();i++) {
            result += str.charAt(i) - 64;
        }
        System.out.println(result);
    }
}