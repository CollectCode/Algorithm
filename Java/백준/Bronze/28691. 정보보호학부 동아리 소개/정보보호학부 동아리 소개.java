import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        if (str.equals("M")) {
            bw.write("MatKor");
        } else if (str.equals("W")) {
            bw.write("WiCys");
        } else if (str.equals("C")) {
            bw.write("CyKor");
        } else if (str.equals("A")) {
            bw.write("AlKor");
        } else if (str.equals("$")) {
            bw.write("$clear");
        }

        bw.flush();
        bw.close();
    }
}