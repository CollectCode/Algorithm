import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] list = new int[num];

        for (int i = 0; i < num; i++) {
            String str = scn.next();
            String[] slist = str.split("");
            int score = 0;
            int index = 0;
            int incre = 0;
            while (true) {
                if (slist.length <= index) {
                    list[i] = score;
                    break;
                }

                if (slist[index].equals("O")) {
                    incre++;
                    score += incre;
                } else {
                    incre = 0;
                }

                index++;
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        scn.close();
    }
}