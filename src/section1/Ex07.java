package section1;

import java.util.Scanner;

public class Ex07 {

    public static String solution(String str) {
        String answer;
        str = str.toLowerCase();
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        boolean result = false;
        while (lt < rt) {
            if (c[lt] != c[rt]) {
                break;
            }
            lt++;
            rt--;
            if (lt >= rt) {
                result = true;
            }
        }

        if (result == true) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
