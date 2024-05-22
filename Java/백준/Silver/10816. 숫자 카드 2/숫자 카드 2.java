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
        int[] sang = new int[20000001];
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            int tmp = Integer.parseInt(str[i]) + 10000000;
            sang[tmp] += 1;
        }

        int que = Integer.parseInt(br.readLine());
        String[] str2 = br.readLine().split(" ");

        for (int i = 0; i < que; i++) {
            int tmp = Integer.parseInt(str2[i]) + 10000000;
            bw.write(sang[tmp] + " ");
        }

        bw.flush();
        bw.close();
    }
}