import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] star = new int[3000000];
        int cnt = 0;
        while (true) { 
            star[cnt] = Integer.parseInt(br.readLine());
            if(star[cnt]==0) break;
            cnt++;
        }
        for(int k=0;k<star.length;k++)  {
            for(int i=1;i<=star[k];i++) {
                for(int j=1;j<=star[k];j++) {
                    if(j<=i) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}