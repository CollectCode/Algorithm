import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int num = Integer.parseInt(str[1]);
        HashMap<Integer, Integer> list = new HashMap<>();
        String[] str2 = br.readLine().split(" ");

        for (int i = 0; i < str2.length; i++) {
            int tmp = Integer.parseInt(str2[i]);
            list.put(tmp, tmp);
        }

        String[] str3 = br.readLine().split(" ");
        int count = str2.length + str3.length;

        for (int i = 0; i < str3.length; i++) {
            int tmp = Integer.parseInt(str3[i]);
            try {
                if (tmp == list.get(tmp)) {
                    count -= 2;
                }
            } catch (Exception e) {
                continue;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}