import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int[] nums = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        String[] result = (num1 * num2 * num3 + "").split("");
        int[] result2 = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            result2[i] = Integer.parseInt(result[i]);
        }

        for (int i = 0; i < result.length; i++) {
            nums[result2[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        scn.close();
    }
}