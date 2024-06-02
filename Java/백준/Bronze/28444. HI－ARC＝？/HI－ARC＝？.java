import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        int num4 = scn.nextInt();
        int num5 = scn.nextInt();

        int result = num1 * num2;
        int result2 = num3 * num4 * num5;

        System.out.println(result - result2);
    }
}