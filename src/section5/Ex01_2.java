package section5;

import java.util.Scanner;
import java.util.Stack;

//올바른 괄호 다른 풀이
public class Ex01_2 {
    public static String solution(String str) {
        String ans="YES";
        Stack<Character> stack = new Stack<>();

        for (Character x : str.toCharArray()) {
            if (x == '(') { // '('는 스택에 다 추가
                stack.push(x);
            } else {
                // ')'가 나왔는데 스택이 비어있다면 ()) 와 같은 경우가 발생했으므로 NO 이다.
                if (stack.isEmpty()) {
                    return "NO";
                }
                // 스택에 원소가 있다면 ()가 쌍을 이루므로 하나 제거
                stack.pop();
            }
        }

        // 끝났는데 스택이 비어있지 않다면 ()( 와 같이 '('가 더 많은 경우이므로 NO 이다.
        if (!stack.isEmpty()) {
            return "NO";
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
