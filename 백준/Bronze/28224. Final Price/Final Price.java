import java.util.Scanner;

public class Main    {
    public static void main(String args[])    {
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++)    {
            int tmp = scn.nextInt();
            sum += tmp;
        }
        System.out.println(sum);
    }
}