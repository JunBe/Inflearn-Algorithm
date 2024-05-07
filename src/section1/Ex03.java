package section1;

import java.util.Scanner;

//문장 속 단어
public class Ex03 {
    public static String solution(String str) {
        String answer = "";
        int len = 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (word.length() > len) {
                len = word.length();
                answer = word;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
