import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int time = Integer.parseInt(str[0]);
        int sool = Integer.parseInt(str[1]);

        if ((time >= 12 && time <= 16) && sool == 0) {
            System.out.println("320");
        } else {
            System.out.println("280");
        }
    }
}