import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int num1 = Integer.parseInt(list[0]);
        int num2 = Integer.parseInt(list[1]);
        int num3 = Integer.parseInt(list[2]);
        int num4 = Integer.parseInt(list[3]);
        bw.write(num1 * 56 + num2 * 24 + num3 * 14 + num4 * 6 + "");
        bw.flush();
        bw.close();
    }
}
