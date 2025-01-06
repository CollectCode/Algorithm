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
    private static int[][] map = new int[129][129];
    private static int white = 0;
    private static int blue = 0;

    public static void main(String args[]) throws IOException {
        int size = Integer.parseInt(br.readLine());
        for(int i=1;i<=size;i++)    {
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=size;j++)    {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        find(1,1,size);
        System.out.println(white + "\n" + blue);
    }

    static void find(int startx, int starty, int len)  {
        if(len < 1) return;
        int defal = map[startx][starty];
        for(int i=startx;i<startx+len;i++) {
            for(int j=starty;j<starty+len;j++) {
                if(map[i][j] != defal) {
                    find(startx, starty, len/2);
                    find(startx+len/2,starty,len/2);
                    find(startx,starty+len/2,len/2);
                    find(startx+len/2, starty+len/2, len/2);
                    return;
                }
            }
        }
        if(defal==0)    {
            white++;
        } else {
            blue++;
        }
    }
}