import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int maximumValue = 4000000;
    private static int mod = 1000000007;
    private static long[] fac = new long[maximumValue+1];

    private static long seoung(long n, long k)    {
        if(k == 0) return 1 % mod;
        long t = seoung(n, k/2);
        t = (t*t)%mod;
        if(k % 2 == 1) t = (t*n)%mod;
        return t;
    }

    private static long getResult(int a, int b) {
        return ((fac[a]*seoung(fac[b], mod-2)) % mod) * seoung(fac[a-b], mod-2) % mod;
    }

    public static void main(String args[]) throws IOException {
        int N,K;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        fac[0] = 1;
        for(int i=1;i<=maximumValue;i++) {
            fac[i] = fac[i-1] * i % mod;
        }

        System.out.println(getResult(N,K));
    }
}