import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    static int search(int[] sangs, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (sangs[mid] == target) {
            return 1;
        } else if (target > sangs[mid]) {
            if (mid == end) {
                return 0;
            } else {
                return search(sangs, target, mid + 1, end);
            }
        } else {
            if (start == mid) {
                return 0;
            } else {
                return search(sangs, target, start, mid - 1);
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근이 배열 크기 설정
        int sang = Integer.parseInt(br.readLine());
        // 상근이 카드번호 설정
        int[] sangs = new int[sang];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < sangs.length; i++) {
            sangs[i] = Integer.parseInt(str[i]);
        }

        // 번호들 배열 크기 설정
        int num = Integer.parseInt(br.readLine());
        // 찾을 카드번호들 설정
        int[] nums = new int[num];
        str = br.readLine().split(" ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }

        // 결과물 출력 배열제작
        int[] result = nums.clone();

        Arrays.sort(sangs);

        // 상근이카드와 번호를 비교해서 같으면 1 같지 않으면 0을 넣어줌
        for (int i = 0; i < result.length; i++) {
            result[i] = search(sangs, nums[i], 0, sangs.length - 1);
        }

        // 결과물 출력
        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}