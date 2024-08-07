import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger num1 = new BigInteger(br.readLine());
        BigInteger num2 = new BigInteger(br.readLine());

        bw.write(num1.add(num2) + "");
        bw.flush();
        bw.close();
    }
}