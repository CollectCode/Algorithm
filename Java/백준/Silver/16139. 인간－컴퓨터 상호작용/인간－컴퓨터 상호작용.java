import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int loop;
    private static int[][] count = new int[27][200001];
    
    public static void main(String args[]) throws IOException {
        sb = new StringBuilder(br.readLine());
        for(int i=0;i<sb.length();i++)  {
            count[sb.charAt(i)-97][i]++;
        }

        for(int i=0;i<=26;i++)  {
            for(int j=1;j<=200000;j++)  {
                count[i][j] += count[i][j-1];
            }
        }

        loop = Integer.parseInt(br.readLine());

        for(int i=0;i<loop;i++) {
            st = new StringTokenizer(br.readLine());
            char word = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(start <= 0)  {
                bw.write(count[word-97][end]+"\n");
            } else {
                bw.write((count[word-97][end] - count[word-97][start-1]) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}