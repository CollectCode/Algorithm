import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int[] stair = new int[101];
    private static int[][] numcnt = new int[101][10];
    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<numcnt[1].length;i++)    {
            numcnt[1][i] = 1;
        }
        stair[1]=9;
        for(int i=2;i<=100;i++) {
            for(int j=0;j<numcnt[i].length;j++)    {
                if(j==0)    {
                    numcnt[i][j]+=numcnt[i-1][j+1] % 1000000000;
                } else if(j==9) {
                    numcnt[i][j]+=numcnt[i-1][j-1] % 1000000000;
                } else {
                    numcnt[i][j]+=numcnt[i-1][j+1] % 1000000000;
                    numcnt[i][j]+=numcnt[i-1][j-1] % 1000000000;
                }
            }
            stair[i]=(((stair[i-1]*2)-(numcnt[i-1][0] + numcnt[i-1][9])) % 1000000000 + 1000000000) % 1000000000;
        }
        System.out.println(stair[n]);
    }
}