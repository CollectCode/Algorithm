import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String str2 = "h";
        for (int i = 0; i < (str.length() - 2) * 2; i++) {
            str2 += "e";
        }
        str2 += "y";
        System.out.println(str2);
    }
}