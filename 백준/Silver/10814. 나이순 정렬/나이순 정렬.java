import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[][] primarykey = new int[num][2];
        String[] name = new String[num];

        for (int i = 0; i < num; i++) {
            primarykey[i][0] = i;
            String[] str = br.readLine().split(" ");
            primarykey[i][1] = Integer.parseInt(str[0]);
            name[i] = str[1];
        }

        Arrays.sort(primarykey, (p1, p2) -> {
            return p1[1] - p2[1];
        });

        for (int i = 0; i < primarykey.length; i++) {
            bw.write(primarykey[i][1] + " " + name[primarykey[i][0]] + "\n");
        }

        bw.flush();
        bw.close();
    }
}