package section5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex01_3 {
    public static String solution(String str) {
        // ( -> 스택에 추가
        // ) -> 스택에 (가 있다면 빼고 스택에 (가 없다면 NO 리턴
        // 처음에 str 길이가 짝수가 아니라면 NO 리턴
        // 다 돌고 스택이 비지 않으면 NO
        // 다 돌고 스택이 비면 YES

        Deque<Character> stack = new ArrayDeque<>();
        stack.push('A');
        stack.pop();
        if (str.length() % 2 != 0) {
            return "NO";
        }

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                if (stack.getFirst() == '(') {
                    stack.pop();
                } else {
                    return "NO";
                }
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
