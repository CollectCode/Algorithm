import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        int loop = Integer.parseInt(st.nextToken());

        for(int i=0;i<loop;i++) {
            st = new StringTokenizer(br.readLine());
            char ch = st.nextToken().charAt(0);
            arr[ch-'a']++;
        }

        for(int i=0;i<arr.length;i++) {
            if(arr[i] >= 5) {
                char t = (char) ('a'+ i);
                sb.append(t);
            }
        }

        System.out.println(sb.length() == 0 ? "PREDAJA" : sb);
    }
}