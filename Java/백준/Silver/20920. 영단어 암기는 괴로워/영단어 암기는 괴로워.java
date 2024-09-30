import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main   {
    public static void main(String args[]) throws IOException   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        int loop = Integer.parseInt(st.nextToken());
        int many = Integer.parseInt(st.nextToken());

        for(int i=0;i<loop;i++) {
            String str = br.readLine();
            if(str.length()<many)   {
                continue;
            }
            if(words.containsKey(str))  {
                words.put(str, words.get(str)+1);
                continue;
            }
            words.put(str, 0);
        }

        ArrayList<String> sor = new ArrayList<>(words.keySet());                                // HashMap의 key값을 arrayList에 넣기
        Collections.sort(sor);                                                                  // 사전순으로 비교하여 오름차순으로 정렬
        Collections.sort(sor, (v1,v2) -> Integer.valueOf(v2.length()).compareTo(v1.length()));  // 글자수를 비교하여 내림차순으로 정렬
        Collections.sort(sor, (v1,v2) -> (words.get(v2).compareTo(words.get(v1))));             // 각 key값을 비교하여 내림차순으로 정렬
        
        for(String key : sor) {
            bw.write(key + "\n");
        }
        bw.flush();
        bw.close();
    }
}