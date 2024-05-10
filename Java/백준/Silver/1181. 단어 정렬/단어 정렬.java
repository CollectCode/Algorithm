import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            if (!list.contains(str)) {
                list.add(str);
                list2.add(str.length());
            }
        }

        Collections.sort(list);
        Collections.sort(list2);

        for (int i : list2) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).length() == i) {
                    bw.write(list.get(j) + "\n");
                    list.remove(j);
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}