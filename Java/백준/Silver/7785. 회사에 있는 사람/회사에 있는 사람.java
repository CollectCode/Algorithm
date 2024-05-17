import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, String> list = new HashMap<>();
        int num = Integer.parseInt(br.readLine());
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            list.put(str[0], str[1]);
        }

        for (String key : list.keySet()) {
            if (list.get(key).equals("enter")) {
                list2.add(key);
            }
        }

        Collections.sort(list2);
        Collections.reverse(list2);

        for (int i = 0; i < list2.size(); i++) {
            bw.write(list2.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}