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
        int count = 0;
        int num = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        String[] list1 = new String[num];
        String[] list2 = new String[num2];

        for (int i = 0; i < num; i++) {
            list1[i] = br.readLine();
        }

        for (int i = 0; i < num2; i++) {
            list2[i] = br.readLine();
        }

        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num; j++) {
                if (list2[i].equals(list1[j])) {
                    count++;
                }
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}