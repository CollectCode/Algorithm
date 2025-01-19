import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] list,tmp;
    private static int size;
    private static int save;

    private static void div(int start, int end)    {
        if(start<end)   {
            int m = (end+start)/2;
            div(start, m);
            div(m+1, end);
            merge(start, m, end);
        }
    }

    private static void merge(int start, int mid, int end)  {
        int i=start;
        int j=mid+1;
        int t=1 ;
        while(i<=mid && j<=end)   {
            if(list[i] < list[j])  {
                tmp[t++] = list[i++];
            } else {
                tmp[t++] = list[j++];
            }
        }
        while(i<=mid)   {tmp[t++] = list[i++];}
        while(j<=end)   {tmp[t++] = list[j++];}
        i=start;
        t=1;
        while(i<=end) {
            save--;
            if(save==0) {
                System.out.println(tmp[t]);
                System.exit( 0);
            }
            list[i++] = tmp[t++];
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        size = Integer.parseInt(st.nextToken());
        save = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        list = new int[size+1];
        tmp = new int[size+1];
        for(int i=1;i<=size;i++) {
            list[i] = Integer.parseInt(st2.nextToken());
        }
        div(1, size);
        System.out.println("-1");
    }
}