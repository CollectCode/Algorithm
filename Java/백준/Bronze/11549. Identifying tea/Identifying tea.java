import java.util.Scanner;

public class Main    {
    public static void main(String args[])    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++)    {
            int num2 = scn.nextInt();
            if(num == num2)    {
                count++;
            }
        }
        
        System.out.println(count);
    }
}