package section1;

import java.util.Scanner;

public class Ex07_2 {

    public static String solution(String str) {
        String answer = "YES";
        String str2 = new StringBuilder(str).reverse().toString();
        for (int i = 0; i < str.length(); i++) {
            if (!str.equalsIgnoreCase(str2)) {
                return "NO";
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
