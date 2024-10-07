import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] q = new int[1000000];
        int[] q2 = new int[1000000];
        int[] chk = new int[101];
        int bt=-1;
        int top=-1;
        int ladder = Integer.parseInt(st.nextToken());
        int snake = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<ladder+snake;i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            map.put(s, d);
        }
        q[++top] = 1;
        q2[top] = 0;
        while(true) {
            int lo = q[++bt];
            int lo2 = q2[bt];
            for(int i=1;i<=6;i++)  {
                if(chk[lo+i]==0)  {
                    q[++top] = lo+i;
                    q2[top] = lo2+1;
                    if(map.containsKey(q[top]))  {
                        q[top] = map.get(q[top]);
                        map.remove(q[top]);
                    }
                    chk[q[top]]++;
                }
                if(q[top]==100) {
                    System.out.println(q2[top]);
                    System.exit(0);
                }
            }
        }
    }
}