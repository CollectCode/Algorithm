import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        if (str1.length() >= str2.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}