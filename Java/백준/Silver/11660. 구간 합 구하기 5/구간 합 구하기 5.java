import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int loop;
    private static int size;
    private static int[][] map = new int[1025][1025];
    private static int[][] point = new int[100001][4];

    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        size = Integer.parseInt(st.nextToken());
        loop = Integer.parseInt(st.nextToken());
        for(int i=1;i<=size;i++)    {
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=size;j++)    {
                map[i][j] = map[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0;i<loop;i++)    {
            int result=0;
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++)    {
                point[i][j] = Integer.parseInt(st.nextToken());
            }
            int startx = point[i][0];
            int starty = point[i][1];
            int endx = point[i][2];
            int endy = point[i][3];

            for(int j=0;j<=endx-startx;j++) {
                result += map[startx+j][endy]-map[startx+j][starty-1];
            }

            System.out.println(result);
        }
    }
}