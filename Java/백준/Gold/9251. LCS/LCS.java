import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int lcs[][];
    public static void main(String args[]) throws IOException {
        String str1 = br.readLine();
        String str2 = br.readLine();
        lcs = new int[str1.length()+1][str2.length()+1];
        for(int i=1;i<=str1.length();i++)    {
            for(int j=1;j<=str2.length();j++)    {
                if(str1.charAt(i-1)==str2.charAt(j-1))  {
                    lcs[i][j] = lcs[i-1][j-1]+1; 
                } else  {
                    if(lcs[i-1][j]>lcs[i][j-1]) {
                        lcs[i][j] = lcs[i-1][j];
                    } else  {
                        lcs[i][j] = lcs[i][j-1];
                    }
                }
            }
        }
        System.out.println(lcs[str1.length()][str2.length()]);
    }
}