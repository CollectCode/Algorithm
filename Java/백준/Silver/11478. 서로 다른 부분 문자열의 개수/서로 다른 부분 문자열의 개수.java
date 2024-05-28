import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, String> list = new HashMap<>();
        String[] str = br.readLine().split("");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            String str2 = "";
            for (int j = i; j < str.length; j++) {
                str2 += str[j];
                if (!(list.containsKey(str2))) {
                    list.put(str2, str2);
                    count++;
                }
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
