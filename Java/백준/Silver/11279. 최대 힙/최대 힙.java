import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] heap;
    private static int N, lastIndex = 0;

    // swap method
    static void swap(int index1, int index2)  {
        int t = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = t;
    }

    // find Location
    static void findLoc(int index) {
        int parent = index / 2;
        // 0번 노드 접근시 탈출
        if (parent == 0) return;
        // 부모 노드가 찾고자 하는 위치의 값보다 크면 스왑 후 부모 노드로 접근
        if (heap[parent] < heap[index]) {
            swap(parent, index);
            findLoc(parent);
        }
    }

    // re sort
    static void resort(int index) {
        // 좌, 우 노드 인덱스지정
        int leftIndex = index * 2;
        int rightIndex = index * 2 + 1;
        int nextIndex;
        // 좌, 우 노드가 둘다 0이면 반환
        if(heap[rightIndex]+heap[leftIndex] == 0) return;
        // 위치를 찾고자 하는 값이 좌, 우 자식 노드보다 더 크면 반환
        if(heap[index] > heap[rightIndex] && heap[index] > heap[leftIndex]) return;
        // 우측 노드가 좌측 노드보다 값이 더 크면 스왑 후 다음 인덱스로 지정
        if(heap[rightIndex] > heap[leftIndex]) {
            nextIndex = rightIndex;
            swap(rightIndex, index);
        }
        // 반대 상황
        else {
            nextIndex = leftIndex;
            swap(index, leftIndex);
        }
        // 지정된 인덱스와 값을 매개변수로 재귀...
        resort(nextIndex);
    }

    // Main Process
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        heap = new int[1000000];
        // 집어넣기
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            // 0 나오면 출력하고 맨 아래노드를 맨 위로 올려서 재정렬
            if (t == 0) {
                System.out.println(heap[1]);
                heap[1] = heap[lastIndex];
                if(lastIndex == 0) lastIndex = 1;
                heap[lastIndex--] = 0;
                resort(1);
                continue;
            }
            // 0 말고 다른거 나오면 맨끝 노드에 추가하고 알맞은 위치 찾아가기
            heap[++lastIndex] = t;
            findLoc(lastIndex);
        }
    }
}