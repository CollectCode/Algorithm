import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static char[][] stars;
    private static int[][] chk;
    private static int num;
    private static void drawing(int x, int y, int size) throws IOException  {
        if(size>num) return;
        for(int i=x;i<x+size/3;i++) {
            for(int j=y;j<y+size/3;j++) {
                stars[i][j] = ' ';
            }
        }
        chk[x][y]=1;
        if(x+size<num && chk[x+size][y]==0)    {
            drawing(x+size,y,size);
        }
        if(y+size<num && chk[x][y+size]==0) {
            drawing(x,y+size,size);
        }
    }
    public static void main(String args[]) throws IOException {
        num = Integer.parseInt(br.readLine());
        stars = new char[num][num];
        chk = new int[num][num];
        for(int i=0;i<num;i++)  {
            for(int j=0;j<num;j++)  {
                stars[i][j] = '*';
            }
        }
        for(int i=3;i<=num;i*=3) {
            drawing(i/3,i/3,i);
        }
        for(int i=0;i<num;i++)  {
            for(int j=0;j<num;j++)  {
                bw.write(stars[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}