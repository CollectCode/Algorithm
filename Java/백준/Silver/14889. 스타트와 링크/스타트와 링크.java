import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n, t, min = 99999999, m=0;
    private static StringBuilder sb = new StringBuilder("");
    private static int map[][];
    private static int chk[] = new int[21];
    private static int team[] = new int[21];
    private static int result[] = new int[2];

    private static void divideTeam(int dep, int loc) {
        if (dep == n / 2) {
            for (int i = 1; i <= n; i++) {
                if (chk[i] == 1) {
                    team[i] = 1;
                } else if (chk[i] == 0) {
                    team[i] = 2;
                }
            }
            process();
            getAnswer();
            reset();
            m--;
            return;
        }
        for (int i = loc; i <= n; i++) {
            if (chk[i] == 0) {
                chk[i] = 1;
                divideTeam(dep + 1, i);
                chk[i] = 0;
            }
        }
    }

    private static void getAnswer() {
        t = result[0] - result[1];
        if (t < 0) {t *= -1;}
        if (t < min) {min = t;}
        return;
    }

    private static void reset() {
        result[0] = 0;
        result[1] = 0;
        return;
    }

    private static void process() {
        for(int i=1;i<=n;i++)   {
            for(int j=i;j<=n;j++)   {
                if(team[i]==1&&team[j]==1) {
                    result[0]+=map[i][j];
                    result[0]+=map[j][i];
                } 
                else if(team[i]==2&&team[j]==2) {
                    result[1]+=map[i][j];
                    result[1]+=map[j][i];
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        for(int i=1;i<=n-2;i++)   {
            m += i;
        }
        map = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            String[] str = new String[n];
            str = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    int t = Integer.parseInt(str[j - 1]);
                    map[i][j] = t;
                }
            }
        }
        divideTeam(0,1);
        System.out.println(min);
    }
}