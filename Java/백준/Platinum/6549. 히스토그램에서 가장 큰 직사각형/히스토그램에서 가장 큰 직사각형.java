import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] heights;
    private static int loop = 0;
    private static long max_result = 0;

    // Main Process
    public static void main(String[] args) throws IOException {
        while(true) {
            st = new StringTokenizer(br.readLine());
            loop = Integer.parseInt(st.nextToken());

            // 0을 입력받을 때는 멈추기
            if(loop == 0)   {
                break;
            }

            // 받은 값을 토대로 배열 크기 설정
            heights = new int[loop];

            // 받은 값만큼 heights배열에 값 넣어주기
            for(int i=0;i<loop;i++) {
                heights[i] = Integer.parseInt(st.nextToken());
            }

            // 스택 작업 들어가기전 스택 초기화 및 MAX값 초기화 작업 진행
            Stack<Integer> stack = new Stack<Integer>();
            max_result = 0;

            // 스택에는 Index값을 쌓는다.
            for(int i=0;i<loop;i++) {
                // 스택이 비어있지 않고, heights[stack의 맨위값]과 비교하여 heights[]의 현재 index값이 더 작거나 같을때
                while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])  {
                    // 스택 맨위값을 높이로 설정
                    int height = heights[stack.pop()];
                    
                    // 스택이 비어있으면 가로값을 현재 index값으로 설정
                    // (제일 높이가 낮음으로 height를 그냥 곱해주면됨)
                    // 비어있지 않다면 현재 index값에서 1을빼고 스택의 가장 위에있는값을 뺀값을 width로 저장
                    // (다음 index에서 시작했음으로 현재 index에서 곱하기위해 1을 빼고)
                    // (현재 index와 가장 가까움과 동시에 작은 값을 뺀다. 그게 스택 맨위에 담겨있다.{여태 점점 큰값을 스택에 쌓았음으로...})
                    long width;
                    if(stack.isEmpty()) {
                        width = i;
                    } else {
                        width = i - 1 - stack.peek();
                    }
                    
                    // MAX값 구하기
                    max_result = Math.max(max_result, height * width);
                }
                
                // 모든 작업이 끝난 후 stack에 index넣기
                stack.push(i);
            }
            
            // 작업이 끝난뒤에도 스택에 값이 남아있을 경우에 스택이 빌때까지 위와같이 계속 작업 반복
            while(!stack.isEmpty()) {
                int height = heights[stack.pop()];
                long width;
                if(stack.isEmpty()) {
                    width = loop;
                } else {
                    width = loop - 1 - stack.peek();
                }
                max_result = Math.max(max_result, height * width);
            }
            
            // 최종 결과값 출력 후 현재 반복문 다시 실행
            System.out.println(max_result);
        }
    }
}