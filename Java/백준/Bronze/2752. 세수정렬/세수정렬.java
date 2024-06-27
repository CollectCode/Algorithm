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
        int[] list2 = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            list2[i] = Integer.parseInt(list[i]);
        }

        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                int tmp;
                if (list2[i] < list2[j]) {
                    tmp = list2[i];
                    list2[i] = list2[j];
                    list2[j] = tmp;
                }
            }
        }

        for (int i = 0; i < list2.length; i++) {
            bw.write(list2[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}