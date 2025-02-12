import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] arr;

    static void merge(int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            merge(start, mid);
            merge(mid+1, end);
            sort(start, mid, end);
        }
    }

    static void sort(int sta, int mid, int end)  {
        int[] tmp = new int[arr.length+1];
        int i = sta;
        int j = mid+1;
        int t = sta;

        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j])    {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while(i <= mid)    {tmp[t++] = arr[i++];}
        while(j <= end)    {tmp[t++] = arr[j++];}

        for(int q=sta; q<=end; q++) {
            arr[q] = tmp[q];
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken());
        arr = new int[loop+1];
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=loop;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        merge(1, loop);
        for(int i=2;i<loop;i++)   {
            result += arr[i];
        }
        System.out.println(result);
    }
}