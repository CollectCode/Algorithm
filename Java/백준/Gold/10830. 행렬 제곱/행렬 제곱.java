import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int N;
    private static long B;
    private static int[][] matrix;

    // 분할정복
    private static int[][] process(int[][] mat, long b)   {
        if(b == 1) return mat;
        else {
            int[][] t = process(mat, b/2);
            if(b % 2 == 1)   {
                return multiply2(multiply1(t));
            } else {
                return multiply1(t);
            }
        }
    }

    // 행렬곱셈
    private static int[][] multiply1(int[][] mat)  {
        int[][] result = new int[N][N];
        for(int i=0;i<N;i++)   {
            for(int j=0;j<N;j++)    {
                for(int k=0;k<N;k++)    {
                    result[i][j] += (mat[i][k] * mat[k][j]) % 1000;
                }
                result[i][j] %= 1000;
            }
        }
        return result;
    }

    private static int[][] multiply2(int[][] mat)  {
        int[][] result = new int[N][N];
        for(int i=0;i<N;i++)   {
            for(int j=0;j<N;j++)    {
                for(int k=0;k<N;k++)    {
                    result[i][j] += (mat[i][k] * matrix[k][j]) % 1000;
                }
                result[i][j] %= 1000;
            }
        }
        return result;
    }

    // 메인
    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        B = Long.parseLong(st.nextToken());
        matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] result = process(matrix, B);

        for(int i=0;i<N;i++)    {
            for(int j=0;j<N;j++)    {
                result[i][j] %= 1000;
            }
        }

        for(int i=0;i<N;i++)    {
            for(int j=0;j<N;j++)    {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}