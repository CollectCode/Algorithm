import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] heap = new int[1000000];
    private static int N, lastIndex = 0;

    // swap
    static void swap(int index1, int index2)  {
        int t = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = t;
    }

    // find Location
    static void findAndPlace(int index)  {
        int parent = index/2;
        if(index == 0) return;
        if(heap[parent] > heap[index])  {
            swap(parent, index);
            findAndPlace(parent);
        }
    }

    // re sort
    static void resort(int index)    {
        int left = index*2;
        int right = index*2+1;
        if(heap[left] + heap[right] == 0) return;
        if(heap[left] > heap[index] && heap[right] > heap[index]) return;
        if(heap[right] == 0)    {
            if(heap[left] < heap[index])    {
                swap(left, index);
                resort(left);
            }
            return;
        }
        if(heap[left] < heap[right])    {
            swap(left, index);
            resort(left);
        } else {
            swap(right, index);
            resort(right);
        }
    }

    // Main Process
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        for(int i=1;i<=N;i++)   {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            if(t == 0)  {
                //TODO 큐의 첫번째값(우선순위가 가장 높은값)을 반환하고 해당 index 제거 후 재정렬
                System.out.println(heap[1]);
                if(lastIndex == 0)  lastIndex = 1;
                heap[1] = heap[lastIndex];
                heap[lastIndex--] = 0;
                resort(1);
                continue;
            }
            //TODO 큐의 마지막 index+1에 해당하는 곳에 값을 넣고 알맞은 위치 찾아가기
            heap[++lastIndex] = t;
            findAndPlace(lastIndex);
        }
    }
}