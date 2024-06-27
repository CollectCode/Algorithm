import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split("");
        int[] list2 = new int[list.length];
        int result = 0;

        for (int i = 0; i < list.length; i++) {
            list2[i] = Integer.parseInt(list[i]);
        }

        for (int i = list.length - 1; i >= 0; i--) {
            if (list2[i] == 0) {
                result += list2[i - 1] * 10;
                i--;
            } else {
                result += list2[i];
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}