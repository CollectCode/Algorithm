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
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        int tmp;
        int result1;
        int result2;
        int count = 1;
        // 큰수 -> 작은 수 형태로 정렬
        if (num1 < num2) {
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        // 최대공약수 구하기
        while (true) {
            if (num1 % num2 == 0) {
                result1 = num2;
                break;
            }
            tmp = num2;
            num2 = num1 % num2;
            num1 = tmp;
        }
        // 최소공배수 구하기
        while (true) {
            if ((result1 * count) % Integer.parseInt(str[0]) == 0
                    && (result1 * count) % Integer.parseInt(str[1]) == 0) {
                result2 = result1 * count;
                break;
            }
            count++;
        }

        bw.write(result1 + "\n" + result2);
        bw.flush();
        bw.close();
    }
}
