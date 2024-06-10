import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main   {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("  ___  ___  ___\n");
        bw.write("  | |__| |__| |\n");
        bw.write("  |           |\n");
        bw.write("   \\_________/\n");
        bw.write("    \\_______/\n");
        bw.write("     |     |\n");
        bw.write("     |     |\n");
        bw.write("     |     |\n");
        bw.write("     |     |\n");
        bw.write("     |_____|\n");
        bw.write("  __/       \\__\n");
        bw.write(" /             \\\n");
        bw.write("/_______________\\\n");
        bw.flush();
        bw.close();
    }
}