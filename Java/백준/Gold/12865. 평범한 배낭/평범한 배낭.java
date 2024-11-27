import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int loop;
    private static int liweight;
    private static int maxvalue = 0;
    private static int[][] dp = new int[100001][101];
    private static ArrayList<Bag> bags = new ArrayList<>();

    // 가방 클래스 구현 
    private static class Bag {
        public Bag(int w, int v)    {
            this.weight = w;
            this.value = v;
        }
        int weight;
        int value;
    }

    public static void main(String args[]) throws IOException {
        // 초기설정
        st = new StringTokenizer(br.readLine());
        loop = Integer.parseInt(st.nextToken());
        liweight = Integer.parseInt(st.nextToken());
        
        // 각 물건들의 무게 및 가치 설정
        for(int i=1;i<=loop;i++) {
            st = new StringTokenizer(br.readLine());
            int tw = Integer.parseInt(st.nextToken());
            int tv = Integer.parseInt(st.nextToken());
            bags.add(new Bag(tw, tv));
        }

        // 무게 기준으로 오름차순 정렬
        Collections.sort(bags, (o1, o2) -> o1.weight - o2.weight);
        for(int i=1;i<=liweight;i++) {
            for(int j=1;j<=loop;j++)    {
                Bag bag = bags.get(j-1);
                // 가방의 무게에서 현재 물건의 무게를 뺀값이 0과 같거나 크고, 제한무게보다 작거나 같을때
                if(i-bag.weight >= 0)   {
                    // 방금까지 담은 물건의 무게의 합보다 과거의 물건 무게 합 + 현재 무게 합이 더 큰경우와 비교해서 더 큰값 대입
                    dp[i][j] = Math.max(dp[i-bag.weight][j-1] + bag.value, dp[i][j-1]);
                } else  {
                    dp[i][j] = dp[i][j-1];
                }
                // 값을 넣을때마다 비교해서 최댓값 넣기
                maxvalue = Math.max(dp[i][j], maxvalue);
            }
        }
        System.out.println(maxvalue);
    }
}