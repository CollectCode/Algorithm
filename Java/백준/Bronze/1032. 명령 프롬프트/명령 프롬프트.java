import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb;
        int loop = Integer.parseInt(st.nextToken());
        String pattern = "";
        for (int i = 0; i < loop; i++) {
            sb = new StringBuilder(br.readLine());
            if (pattern.equals("")) {
                pattern = sb.toString();
                continue;
            }
            for (int j = 0; j <= sb.length()-1; j++) {
                if (sb.charAt(j) != '?' && (sb.charAt(j) != pattern.charAt(j))) {
                    sb.replace(j, j+1, "?");
                }
            }
            pattern = sb.toString();
        }
        System.out.println(pattern);
    }
}