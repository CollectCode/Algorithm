import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        String s1 = st.nextToken();
        st = new StringTokenizer(br.readLine());
        String s2 = st.nextToken();
        st = new StringTokenizer(br.readLine());
        String s3 = st.nextToken();
        long result = 0;

        for(int i=0;i<colors.length;i++)    {
            if(s1.equals(colors[i]))    {
                result += i*10;
            }
        }

        for(int i=0;i<colors.length;i++)    {
            if(s2.equals(colors[i]))    {
                result += i;
            }
        }

        for(int i=0;i<colors.length;i++)    {
            if(s3.equals(colors[i]))    {
                result *= Math.pow(10, i);
            }
        }

        System.out.println(result);
    }
}