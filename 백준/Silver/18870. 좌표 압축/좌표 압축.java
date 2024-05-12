import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 배열 크기 설정
        int count = 0;
        int num = Integer.parseInt(br.readLine());

        // ArrayList 생성
        int[] main = new int[num];
        HashMap<Integer, Integer> key = new HashMap<Integer, Integer>();

        // ArrayList에 좌표값 입력
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            main[i] = Integer.parseInt(str[i]);
        }
        
        // 만든 배열 복사
        int[] sortedMain = main.clone();
        Arrays.sort(sortedMain);
        
        // key에 값이 있으면 
        for (int i = 0; i < sortedMain.length; i++) {
            if(!(key.containsKey(sortedMain[i])))  {
                key.put(sortedMain[i], count);
                count++;
            }
        }

        // 결과값 출력
        for (int i = 0; i < main.length; i++) {
            bw.write(key.get(main[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}