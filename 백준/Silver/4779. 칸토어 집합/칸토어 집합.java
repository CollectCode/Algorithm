import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb;
    private static String str;
    private static int num;
    private static double po;
    private static void process(StringBuilder st, int fi, int la) {
        int i,j;
        i = fi+(la-fi)/3;
        j = la-(la-fi)/3;
        if(la-fi<2) return;
        while(i<j) {st.setCharAt(i++, ' ');}
        process(st, fi, fi+(la-fi)/3);
        process(st, fi+(la-fi)/3*2, la);
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t;
        while((t=br.readLine())!=null && !t.isEmpty())  {
            str = "";
            sb = new StringBuilder(str);
            num = Integer.parseInt(t);
            po = Math.pow(3, num);
            for(int i=0;i<po;i++)   {
                sb.append("-");
            }
            process(sb, 0, sb.length());
            System.out.println(sb);
        }
    }
}