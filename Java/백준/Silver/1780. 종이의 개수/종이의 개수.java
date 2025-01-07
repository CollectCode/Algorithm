import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int[][] map;
    private static int mone = 0;
    private static int zero = 0;
    private static int one = 0;
    private static int size;

    static void find(int startx, int starty, int len)  {
        int defal = map[startx][starty];
        for(int i=startx;i<startx+len;i++)  {
            for(int j=starty;j<starty+len;j++)  {
                if(defal != map[i][j])  {
                    find(startx, starty, len/3);
                    find(startx, starty+len/3, len/3);
                    find(startx, starty+len/3*2, len/3);
                    find(startx+len/3, starty, len/3);
                    find(startx+len/3*2, starty, len/3);
                    find(startx+len/3, starty+len/3, len/3);
                    find(startx+len/3*2, starty+len/3, len/3);
                    find(startx+len/3, starty+len/3*2, len/3);
                    find(startx+len/3*2, starty+len/3*2, len/3);
                    return;
                }
            }
        }
        if(defal == -1) {
            mone++;
        } else if(defal == 0)  {
            zero++;
        } else  {
            one++;
        }
    }

    public static void main(String args[]) throws IOException {
        size = Integer.parseInt(br.readLine());
        map = new int[size+1][size+1];
        for(int i=1;i<=size;i++)    {
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=size;j++)    {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        find(1,1,size);
        System.out.println(mone + "\n" + zero + "\n" + one);
    }
}