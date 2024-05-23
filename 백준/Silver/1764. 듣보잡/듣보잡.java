import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main   {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int hear = Integer.parseInt(str[0]);
        int see = Integer.parseInt(str[1]);
        HashMap<String, String> list = new HashMap<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < hear; i++)  {
            String str2 = br.readLine();
            list.put(str2, str2);
        }

        for (int i = 0; i < see; i++)   {
            String str2 = br.readLine();
            if(list.containsKey(str2))  {
                list2.add(list.get(str2));
            }
        }

        Collections.sort(list2);
        bw.write(list2.size() + "\n");
        
        for (int i = 0; i < list2.size(); i++)  {
            bw.write(list2.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}