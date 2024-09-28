import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, Integer> nameList = new HashMap<String, Integer>();
        int num = scn.nextInt();
        int result = 0;

        for(int i=0;i<num;i++)  {
            String str1 = scn.next();
            String str2 = scn.next();
            if(str1.equals("ChongChong"))  {
                nameList.put(str1, 1);
                nameList.put(str2, 1);
                continue;
            }
            if(str2.equals("ChongChong"))  {
                nameList.put(str1, 1);
                nameList.put(str2, 1);
                continue;
            }
            if(nameList.containsKey(str1))  {
                if(nameList.get(str1)==1)   {
                    nameList.put(str1, 1);
                    nameList.put(str2, 1);
                    continue;
                }
            }
            if(nameList.containsKey(str2))  {
                if(nameList.get(str2)==1)   {
                    nameList.put(str1, 1);
                    nameList.put(str2, 1);
                    continue;
                }
            }
            nameList.put(str1, 0);
            nameList.put(str2, 0);    
        }
        for(String key : nameList.keySet())  {
            result += nameList.get(key);
        }
        System.out.println(result);
    }
}