import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int head = Integer.parseInt(st.nextToken());
        int leg = Integer.parseInt(st.nextToken());
        int chicken = 0;
        int cow = 0;
        int t = 0;

        t = head * 2;
        chicken = head;
        if(leg == t) {
            chicken = head;
            System.out.println(chicken + " " + cow);
            System.exit(0);
        }

        cow = (leg - t)/2;
        chicken -= cow;
        System.out.println(chicken + " " + cow);
    }
}