import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, Integer> nameList = new HashMap<String, Integer>();
        int loop = scn.nextInt();
        int cnt = 0;
        int result = 0;
        while(true) {
            if(loop == 0) {
                result+=cnt;
                break;
            }
            String st = scn.next();
            if(st.equals("ENTER"))  {
                loop--;
                result+=cnt;
                nameList.clear();
                cnt=0;
                continue;
            }
            if(!nameList.containsKey(st))  {
                nameList.put(st, cnt);
                cnt++;
            }
            loop--;
        }
        System.out.println(result);
        scn.close();
    }
}