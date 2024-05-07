package section1;

import java.util.Scanner;

public class Ex09 {
    public static String solution(String str) {
        String answer = "";
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                ans.append(str.charAt(i));
            }
        }
        while (ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        answer = ans.toString();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
