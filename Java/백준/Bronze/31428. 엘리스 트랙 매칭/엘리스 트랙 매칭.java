import java.util.Scanner;

public class Main   {
    public static void main(String args[])  {
        Scanner scn = new Scanner(System.in);
        int c=0,s=0,i=0,a=0;
        int loop = scn.nextInt();
        for(int j=0;j<loop;j++) {
            String t = scn.next();
            if(t.equals("C"))  {
                c++;
            } else if(t.equals("S"))   {
                s++;
            } else if(t.equals("I"))   {
                i++;
            } else {
                a++;
            }
        }
        String result = scn.next();
        if(result.equals("C"))  {
            System.out.println(c);
        } else if(result.equals("S"))   {
            System.out.println(s);
        } else if(result.equals("I"))   {
            System.out.println(i);
        } else {
            System.out.println(a);
        }
    }
}