import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static int process(String str, int s, int f, int cnt) {
        if(cnt==2 || (cnt==1&&str.charAt(s)!=str.charAt(f))) return 2;
        if(s>=f||f-s==1) 
        {
            if(cnt==1||str.charAt(s)!=str.charAt(f)) return 1;
            return 0;
        }
        if(str.charAt(s)!=str.charAt(f))    {
            int a,b;
            a = process(str, s, f-1, cnt+1);
            b = process(str, s+1, f, cnt+1);
            if(a>b) return b;
            else return a;
        }
        return process(str, s+1, f-1, cnt);
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        for(int i=0;i<num;i++)  {
            String str = br.readLine();
            int s = 0;
            int f = str.length()-1;
            bw.write(process(str, s, f, 0) + "\n");
        }
        bw.flush();
        bw.close();
    }
}