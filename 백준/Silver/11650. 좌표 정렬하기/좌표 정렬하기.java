import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

public class Main   {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int[][] list = new int[num][2];

        for (int j = 0; j < num; j++)   {
            String[] str = br.readLine().split(" ");
            list[j][0] = Integer.parseInt(str[0]);
            list[j][1] = Integer.parseInt(str[1]);
        }
        
        Arrays.sort(list, (p1, p2) ->   {
            if(p1[0] == p2[0])  {
                return p1[1] - p2[1];
            }
            else {
                return p1[0] - p2[0];
            }
        });

        for (int i = 0; i < num; i++)   {
            bw.write(list[i][0] + " ");
            bw.write(list[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}