import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}