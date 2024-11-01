import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int[][] rgb = new int[1010][3];
    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        for(int i=0;i<loop;i++) {
            st = new StringTokenizer(br.readLine());
            rgb[i][0]=Integer.parseInt(st.nextToken());
            rgb[i][1]=Integer.parseInt(st.nextToken());
            rgb[i][2]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<loop;i++) {
            for(int j=0;j<3;j++)    {
                if(j==0) {
                    if(rgb[i-1][1] > rgb[i-1][2])   {
                        rgb[i][j] += rgb[i-1][2];
                    } else {
                        rgb[i][j] += rgb[i-1][1];
                    } 
                }
                if(j==1) {
                    if(rgb[i-1][0] > rgb[i-1][2])   {
                        rgb[i][j] += rgb[i-1][2];
                    } else {
                        rgb[i][j] += rgb[i-1][0];
                    }
                }
                if(j==2) {
                    if(rgb[i-1][1] > rgb[i-1][0])   {
                        rgb[i][j] += rgb[i-1][0];
                    } else {
                        rgb[i][j] += rgb[i-1][1];
                    }
                }
            }
        }
        if(rgb[loop-1][0] <= rgb[loop-1][1] && rgb[loop-1][0] <= rgb[loop-1][2])  {
            System.out.println(rgb[loop-1][0]);
        } else if(rgb[loop-1][1] <= rgb[loop-1][0] && rgb[loop-1][1] <= rgb[loop-1][2])  {
            System.out.println(rgb[loop-1][1]);
        } else if(rgb[loop-1][2] <= rgb[loop-1][1] && rgb[loop-1][2] <= rgb[loop-1][0])  {
            System.out.println(rgb[loop-1][2]);
        }
    }
}