import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int num = Integer.parseInt(str[0]);
        Map<Integer, String> list = new HashMap<>();
        Map<String, Integer> list2 = new HashMap<>();
        int que = Integer.parseInt(str[1]);

        for (int i = 1; i <= num; i++) {
            String str3 = br.readLine();
            list.put(i, str3);
            list2.put(str3, i);
        }

        for (int i = 1; i <= que; i++) {
            String str2 = br.readLine();
            int a;
            try {
                a = Integer.parseInt(str2);
                bw.write(list.get(a) + "\n");
            } catch (Exception e) {
                bw.write(list2.get(str2) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}