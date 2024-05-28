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
        int[] result = new int[num];

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);
            int tmp = 0;
            int tmp3 = num1;
            int tmp2 = num2;
            int max = 1;

            while (true) {
                if (num1 > num2) {
                    tmp = num1;
                    num1 = num2;
                    num2 = tmp;
                }

                if ((num2 %= num1) == num1) {
                    max = num1;
                    result[i] = (tmp3 * tmp2) / max;
                    break;
                } else if ((num2 %= num1) == 0) {
                    max = num1;
                    result[i] = (tmp3 * tmp2) / max;
                    break;
                }
                num2 %= num1;
            }
        }

        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
