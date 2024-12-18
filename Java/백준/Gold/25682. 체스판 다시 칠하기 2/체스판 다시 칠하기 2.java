import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder("");
    private static int cut;
    private static int sizex;
    private static int sizey;
    private static char[][] map = new char[2001][2001];
    private static int[][] nummap = new int[2001][2001];

    public static void main(String args[]) throws IOException {
        int min=99999999;
        int max=0;

        st = new StringTokenizer(br.readLine());
        sizex = Integer.parseInt(st.nextToken());
        sizey = Integer.parseInt(st.nextToken());
        cut = Integer.parseInt(st.nextToken());

        // Black && White 색상을 입력하면서 부적합한 자리일 시 1더함
        for (int i=1;i<=sizex;i++)  {
            String str = br.readLine();
            for(int j=0;j<sizey;j++)   {
                map[i][j+1] = str.charAt(j);
                if(map[i][j+1] == 'B')  {
                    if(i%2==1 && (j+1)%2==1)    {
                        continue;
                    } else if(i%2==0 && (j+1)%2==0) {
                        continue;
                    }
                } else if(map[i][j+1] == 'W')  {
                    if(i%2==0 && (j+1)%2==1)    {
                        continue;
                    } else if(i%2==1 && (j+1)%2==0) {
                        continue;
                    }
                }
                nummap[i][j+1]++;
            }
        }

        // 행 더하기
        for(int i=1;i<=sizex;i++)   {
            for(int j=1;j<=sizey;j++)   {
                nummap[i][j] += nummap[i][j-1];
            }
        }

        // 열 더하기
        for(int i=1;i<=sizex;i++)   {
            for(int j=1;j<=sizey;j++)   {
                nummap[i][j] += nummap[i-1][j];
            }
        }

        // 자른 곳 최대와 최소값 구하기
        for(int i=cut;i<=sizex;i++) {
            for(int j=cut;j<=sizey;j++) {
                int value = nummap[i][j]-(nummap[i-cut][j]+nummap[i][j-cut]-nummap[i-cut][j-cut]);
                max = Math.max(max, value);
                min = Math.min(min, value);
            }
        }

        // 흰색, 검은색으로 시작할때의 값들의 최소를 출력
        System.out.println(Math.min(min, cut*cut-max));
    }
}