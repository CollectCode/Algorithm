import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dots = new int[1001];
        int dot = Integer.parseInt(st.nextToken());
        int multi = 4;
        int plus = 1;
        dots[1] = 3;
        for(int i=2;i<=dot;i++) {
            dots[i] = dots[i-1] + (multi * i) + plus;
            multi++;
            plus += i;
        }
        System.out.println(dots[dot]);
    }
}