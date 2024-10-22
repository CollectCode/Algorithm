import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n, m;
    private static int chk[] = new int[2];
    private static int fibo[] = new int[41];
    private static int fib(int x)    {
        if(x==1 || x==2) 
        {
            chk[0]++;
            return 1;
        }
        else return (fib(x-1) + fib(x-2));
    }
    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        fibo[1] = 1;
        fibo[2] = 1;
        fib(n);
        System.out.println(chk[0] + " " + (n-2));
    }
}