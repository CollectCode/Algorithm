import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while(!(str=br.readLine()).equals("0")) {
            String[] strs = str.split("");
            int cnt=0;
            cnt+=1;
            for(int i=0;i<strs.length;i++)  {
                int num = Integer.parseInt(strs[i]);
                cnt++;
                if(num == 0)    {
                    cnt+=4;
                } else if(num == 1) {
                    cnt+=2;
                } else  {
                    cnt+=3;
                }
            }
            System.out.println(cnt);
        }
    }
}