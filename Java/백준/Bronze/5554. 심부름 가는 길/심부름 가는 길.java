import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = 0;
        int sec = 0;
        for (int i = 0; i < 4; i++) {
            int t = Integer.parseInt(br.readLine());
            sum+=t;
        }
        min = sum/60;
        sec = sum%60;
        System.out.println(min + "\n" + sec);
    }
}
