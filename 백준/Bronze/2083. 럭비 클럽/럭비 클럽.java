import java.util.Scanner;

public class Main   {
    public static void main(String args[])  {
        Scanner scn = new Scanner(System.in);
        while(true)    {
            String name = scn.next();
            int age = scn.nextInt();
            int weight = scn.nextInt();
            if(name.equals("#") && age==0 && weight==0) {
                break;
            }
            if(age>17 || weight>=80) {
                System.out.println(name + " Senior");
            } else  {
                System.out.println(name + " Junior");
            }
        }
    }
}