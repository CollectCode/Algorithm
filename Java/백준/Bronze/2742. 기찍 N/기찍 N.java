import java.util.Scanner;

public class Main    {
    public static void main(String args[])    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        for (int i = num; i >= 1; i--)    {
            System.out.println(i);
        }
        
        scn.close();
    }
}