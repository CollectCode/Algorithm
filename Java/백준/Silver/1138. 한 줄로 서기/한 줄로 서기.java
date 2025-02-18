import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        int[] arr = new int[100];
        int[] result = new int[100];
        st = new StringTokenizer(br.readLine());

        for(int i=1;i<=loop;i++)    {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<=loop;i++)    {
            int loc = 0;
            int cnt = arr[i];
            while(true) {
                if(result[loc] == 0 && cnt <= 0) {
                    result[loc] = i;
                    break;
                }
                if (result[loc] == 0)  {
                    loc++;
                    cnt--;
                    continue;
                }
                loc++;
            }
        }
        for(int i=0;i<loop;i++)    {
            System.out.print(result[i] + " ");
        }
    }
}