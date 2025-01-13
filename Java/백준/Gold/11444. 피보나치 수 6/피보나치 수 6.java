import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static long[][] defal = {{1, 1}, {1, 0}};
    private static long[][] result;
    private static int primeNum = 1000000007;

    // 분할 정복
    private static long[][] process(long[][] mat, long n) {
        if (n == 1) return mat;
        else {
            long[][] temp = process(mat, n/2);
            if (n % 2 == 1) {
                return multiply2(multiply1(temp));
            } else {
                return multiply1(temp);
            }
        }
    }

    // 행렬 곱셈(N%2==0)
    private static long[][] multiply1(long[][] mat) {
        long t[][] = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    t[i][j] += (mat[i][k] * mat[k][j]) % primeNum;
                }
                t[i][j] %= primeNum;
            }
        }
        return t;
    }

    // 행렬 곱셈(N%2==1)
    private static long[][] multiply2(long[][] mat) {
        long t[][] = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    t[i][j] += (mat[i][k] * defal[k][j]) % primeNum;
                }
                t[i][j] %= primeNum;
            }
        }
        return t;
    }

    // 메인
    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        result = process(defal, N);
        System.out.println(result[0][1]  % primeNum);
    }
}