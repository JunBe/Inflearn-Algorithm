package section5;

import java.util.Scanner;

//올바른 괄호
public class Ex01 {
    public static String solution(String str) {
        String ans="YES";
        int cnt = 0; //괄호의 개수 카운트 변수

        // cnt가 0 이면 '(' 와 ')' 괄호 개수는 같음
        // '(' -> 1 증가 , ')' -> 1 감소
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }
        }

        //NO의 3가지 조건
        // 1. cnt가 0이 아닌 경우 -> 괄호의 개수가 맞지 않음
        // 2. 시작이 ) 괄호로 시작하는 경우 -> 올바른 괄호가 아님
        // 3. 끝이 ( 괄호로 끝나는 경우 -> 올바른 괄호가 아님
        if (cnt != 0 || str.charAt(0) == ')' || str.charAt(str.length() - 1) == '(') {
            ans = "NO";
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
