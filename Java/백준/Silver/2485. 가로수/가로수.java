import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());
        int[] tree = new int[100001];
        int[] hojae = new int[100000];
        int tmp = 0;
        int tmp2 = 0;
        int realhojae = 0;
        int result = 0;

        for (int i = 0; i < loop; i++) {
            tree[i] = Integer.parseInt(br.readLine());
            if (i > 0) {
                hojae[i - 1] = tree[i] - tree[i - 1];
            }
        }

        for (int i = 1; hojae[i] != 0; i++) {
            int tmp3 = 0;
            tmp = hojae[i];
            if (i == 1) {
                tmp2 = hojae[i - 1];
            } else {
                tmp2 = realhojae;
            }
            while (true) {
                if (tmp > tmp2) {
                    tmp3 = tmp;
                    tmp = tmp2;
                    tmp2 = tmp3;
                }
                if (tmp2 % tmp == 0) {
                    break;
                }
                tmp2 %= tmp;
            }
            realhojae = tmp;
        }
        int one = tree[0];
        for (int i = 1; i < loop; i++) {
            if (one + realhojae == tree[i]) {
                one += realhojae;
                continue;
            }
            result++;
            one += realhojae;
            i--;
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}