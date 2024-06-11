import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();
        long num2 = scn.nextLong();

        if (num == num2) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}