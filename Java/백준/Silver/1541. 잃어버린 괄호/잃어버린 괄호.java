import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static String[] minStrs;
    private static String[] plusStrs;

    public static void main(String args[]) throws IOException {
        int result = 0;
        minStrs = br.readLine().split("-");
        for(int i=0;i<minStrs.length;i++)  {
            plusStrs = minStrs[i].split("\\+");
            if(i==0)    {
                for(int j=0;j<plusStrs.length;j++)  {
                    result += Integer.parseInt(plusStrs[j]);
                }
            } else {
                for(int j=0;j<plusStrs.length;j++)  {
                    result -= Integer.parseInt(plusStrs[j]);
                }
            }
        }
        System.out.println(result);
    }
}