import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int mode = 1;
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < num; i++) {
            if (mode == 1) {
                num1 += num2;
                mode--;
                continue;
            }
            mode++;
            num2 += num1;
        }

        if (mode == 1) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}