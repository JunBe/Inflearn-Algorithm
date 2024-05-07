package section1;

import java.util.Scanner;

//문장 속 단어
public class Ex03_2 {
    public static String solution(String str) {
        String answer = "";
        int m = 0;
        int pos;

        while ((pos = str.indexOf(' ') )!= -1) { // i am studying java
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) {
            answer = str;
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
