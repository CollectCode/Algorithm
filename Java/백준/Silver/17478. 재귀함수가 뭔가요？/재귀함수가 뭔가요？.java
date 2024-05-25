import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    private static String message(int count, int goal, String str1, String str2, String str3, String str4, String str5,
            String str6, String result) {
        if (count == goal) {
            for (int i = 0; i < count; i++) {
                str1 += "____";
            }
            return result + str1 + str2 + str1;
        } else {
            for (int i = 0; i < count; i++) {
                str1 += "____";
            }
            count++;
            result += str1 + str2 + str1 + str3 + str1 + str5 + str1 + str6;
            str1 = "";
            return message(count, goal, str1, str2, str3, str4, str5, str6, result);
        }
    }

    private static String message2(int count, String str1, String str2, String result) {
        if (count == 0) {
            return result;
        } else {
            for (int i = 0; i < count; i++) {
                str1 += "____";
            }
            count--;
            result += str1 + str2;
            str1 = "";
            return message2(count, str1, str2, result);
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        String str0 = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
        String str1 = "";
        String str2 = "\"재귀함수가 뭔가요?\"\n";
        String str3 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
        String str6 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
        String str7 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
        bw.write(str0);
        String str4 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
        String str5 = "라고 답변하였지.\n";
        String result = "";
        String result2 = "";

        bw.write(message(0, count, str1, str2, str3, str4, str6, str7, result));
        bw.write(str4);
        bw.write(message2(count, str1, str5, result2));
        bw.write(str5);
        bw.flush();
        bw.close();
    }
}
