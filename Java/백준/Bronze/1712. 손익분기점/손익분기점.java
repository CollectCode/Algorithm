import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        long fix = Long.parseLong(str[0]);
        long make = Long.parseLong(str[1]);
        long sell = Long.parseLong(str[2]);
        int count = 0;

        if (make >= sell) {
            bw.write("-1");
        } else {
            bw.write(fix / (sell - make) + 1 + "");
        }

        bw.flush();
        bw.close();
    }
}
