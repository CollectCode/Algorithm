import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = new String[51];
        int[] a = new int[51];
        int[] b = new int[51];
        int num = Integer.parseInt(br.readLine());
        int result = 0;
        tmp = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(tmp[i]);
        }
        tmp = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            b[i] = Integer.parseInt(tmp[i]);
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (a[i] > a[j]) {
                    int itmp = a[i];
                    a[i] = a[j];
                    a[j] = itmp;
                }
                if (b[i] < b[j]) {
                    int itmp = b[j];
                    b[j] = b[i];
                    b[i] = itmp;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            result += a[i] * b[i];

        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}