import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] str = new String[2][2];
        int[][] bunsu = new int[str.length][str.length];
        int[] result = new int[2];
        int max = 0;

        for (int i = 0; i < 2; i++) {
            str[i] = br.readLine().split(" ");
            bunsu[i][0] = Integer.parseInt(str[i][0]);
            bunsu[i][1] = Integer.parseInt(str[i][1]);
        }

        if (bunsu[0][1] == bunsu[1][1]) {
            result[0] = bunsu[0][0] + bunsu[1][0];
            result[1] = bunsu[0][1];

            int ja = result[0];
            int mo = result[1];
            int tmp;
            while (true) {
                if (ja > mo) {
                    tmp = ja;
                    ja = mo;
                    mo = tmp;
                }
                if (mo % ja == 0) {
                    max = ja;
                    break;
                }
                mo %= ja;
            }
        } else {
            result[0] = bunsu[0][0] * bunsu[1][1] + bunsu[0][1] * bunsu[1][0];
            result[1] = bunsu[0][1] * bunsu[1][1];

            int ja = result[0];
            int mo = result[1];
            int tmp;
            while (true) {
                if (ja > mo) {
                    tmp = ja;
                    ja = mo;
                    mo = tmp;
                }
                if (mo % ja == 0) {
                    max = ja;
                    break;
                }
                mo %= ja;
            }
        }
        result[0] /= max;
        result[1] /= max;

        bw.write(result[0] + " " + result[1]);
        bw.flush();
        bw.close();
    }
}