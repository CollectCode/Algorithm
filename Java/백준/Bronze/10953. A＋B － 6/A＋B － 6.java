import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] list2 = new int[2];

        for (int i = 0; i < num; i++) {
            String[] list = br.readLine().split(",");
            list2[0] = Integer.parseInt(list[0]);
            list2[1] = Integer.parseInt(list[1]);
            bw.write(list2[0] + list2[1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
