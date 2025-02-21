import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] members = new int[15][15];

        for(int i=0;i<members.length;i++)   {
            for(int j=1;j<members[i].length;j++)    {
                if(i==0) {
                    members[i][j] = j;
                    continue;
                }
                for(int k=0;k<=j;k++)    {
                    members[i][j] += members[i-1][k];
                }
            }
        }

        int loop = Integer.parseInt(st.nextToken());
        for(int i=0;i<loop;i++) {
            st = new StringTokenizer(br.readLine());
            int floor = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int room = Integer.parseInt(st.nextToken());
            System.out.println(members[floor][room]);
        }
    }
}