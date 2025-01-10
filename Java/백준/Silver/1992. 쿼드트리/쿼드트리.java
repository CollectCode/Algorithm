import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int[][] map = new int[65][65];

    static void find(int startx, int starty, int len)  {
        if(len < 1) return;
        int defal = map[startx][starty];

        for(int i=startx; i<startx+len;i++) {
            for(int j=starty; j<starty+len;j++) {
                if(map[i][j] != defal) {
                    sb.append("(");
                    find(startx, starty, len / 2);
                    find(startx, starty + len / 2, len / 2);
                    find(startx + len / 2, starty, len / 2);
                    find(startx + len / 2, starty + len / 2, len / 2);
                    sb.append(")");
                    return;
                }
            }
        }
        sb.append(defal);
    }

    public static void main(String args[]) throws IOException {
        int size = Integer.parseInt(br.readLine());
        for(int i=1;i<=size;i++)    {
            String[] tempmap = br.readLine().split("");
            for(int j=1;j<=size;j++)    {
                map[i][j] = Integer.parseInt(tempmap[j-1]);
            }
        }
        find(1,1,size);
        System.out.println(sb.toString());
    }
}