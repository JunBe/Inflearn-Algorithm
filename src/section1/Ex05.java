package section1;

import java.util.Scanner;

public class Ex05 {
    public static String solution(String str) {
        String answer;
        int lt = 0;
        int rt = str.length() - 1;
        char[] s = str.toCharArray();
        while (lt < rt) {
            if (('A' > s[lt] || s[lt] > 'z')) { //왼쪽이 특수문자이면
                lt++;
            } else if (('A' > s[rt] || s[rt] > 'z')) { //오른쪽이 특수문자이면
                rt--;
            } else { //모두 특수문자가 아니면
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }
}
