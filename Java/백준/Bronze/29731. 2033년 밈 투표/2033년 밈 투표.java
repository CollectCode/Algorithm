import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] strs = {"Never gonna give you up", "Never gonna let you down", "Never gonna run around and desert you", "Never gonna stop", "Never gonna tell a lie and hurt you", "Never gonna say goodbye", "Never gonna make you cry"};
        int loop = Integer.parseInt(st.nextToken());
        int bol = 0;
        for(int i=0;i<loop;i++) {
            String str = br.readLine();
            boolean bols = false;
            for(int j=0;j<strs.length;j++)  {
                if(strs[j].equals(str)) {
                    bols = true;
                }
            }
            if(!bols) bol++;
        }
        System.out.println(bol == 0 ? "No" : "Yes");
    }
}