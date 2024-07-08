import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int a = 0;
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                break;
            }

            for (int i = num; i >= 0; i--) {
                a += i;
            }

            bw.write(a + "\n");
        }

        bw.flush();
        bw.close();
    }
}