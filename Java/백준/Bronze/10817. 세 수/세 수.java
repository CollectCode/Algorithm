import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int[] list = new int[3];
        int tmp = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = scn.nextInt();
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] >= list[j]) {
                    tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
        System.out.println(list[1]);
    }
}
