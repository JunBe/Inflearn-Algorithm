package section1;

import java.util.Scanner;

//중복된 문자 제거
public class Ex06_2 {
    public static String solution(String str) {//'a' 97
        String answer="";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
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
