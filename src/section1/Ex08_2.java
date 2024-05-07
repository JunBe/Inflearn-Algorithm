package section1;

import java.util.Scanner;

public class Ex08_2 {
    public static String solution(String s) {
        String answer = "YES";
        s = s.toUpperCase().replaceAll("[^A-Z]",""); //대문자로 바꾸기, A-Z가 아니면 빈 문자로 출력하라
        String str2 = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if (str2.charAt(i) != s.charAt(i)) {
                return "NO";
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
