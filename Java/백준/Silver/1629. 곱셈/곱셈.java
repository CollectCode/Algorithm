import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static BigInteger result;
    private static BigInteger A,B,C;

    static BigInteger process(BigInteger a, BigInteger b)   {
        if(b.equals(BigInteger.ONE))   {
            return a.remainder(C);
        } else  {
            BigInteger t = process(a, b.divide(new BigInteger("2")));
            if(b.remainder(new BigInteger("2")).equals(new BigInteger("0"))) {
                return (t.multiply(t)).remainder(C);
            } else {
                return (t.multiply(t).multiply(a)).remainder(C);
            }
        }
    }

    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        A = new BigInteger(st.nextToken());
        B = new BigInteger(st.nextToken());
        C = new BigInteger(st.nextToken());
        result = process(A, B).remainder(C);
        System.out.println(result);
    }
}