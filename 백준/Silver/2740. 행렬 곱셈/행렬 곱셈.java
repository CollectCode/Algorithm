import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String args[]) throws IOException {
        int h1x,h1y,h2x,h2y;

        st = new StringTokenizer(br.readLine());
        h1x = Integer.parseInt(st.nextToken());
        h1y = Integer.parseInt(st.nextToken());
        int[][] h1 = new int[h1x][h1y];
        for(int i=0;i<h1x;i++)  {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<h1y;j++)  {
                h1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        h2x = Integer.parseInt(st.nextToken());
        h2y = Integer.parseInt(st.nextToken());
        int[][] h2 = new int[h2x][h2y];
        for(int i=0;i<h2x;i++)  {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<h2y;j++)  {
                h2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] result = new int[h1x][h2y];
        for(int i=0;i<h1x;i++)  {
            for(int j=0;j<h2y;j++)  {
                for(int k=0;k<h1y;k++) {
                    result[i][j] += h1[i][k] * h2[k][j];
                }
            }
        }

        for(int i=0;i<h1x;i++)  {
            for(int j=0;j<h2y;j++)  {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}