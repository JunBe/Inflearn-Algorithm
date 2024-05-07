package section1;

import java.util.Scanner;

//중복된 문자 제거
public class Ex06 {
    public static String solution(String str) {//'a' 97
        String answer="";
        int[] count = new int[26];
        char[] s = str.toCharArray();

        for (char c : s) {
            if (count[c - 97] == 0) {
                answer += c;
                count[c - 97]++;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
