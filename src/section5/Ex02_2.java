package section5;

import java.util.Scanner;
import java.util.Stack;

//괄호문자제거 다른 풀이
public class Ex02_2 {

    public static String solution(String str) {
        String ans="";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            if (str.charAt(i) == ')') { // 닫는 괄호를 만나면
                while (stack.pop() != '(') { // '(' 과 ')' 와 사이의 알파벳을 모두 삭제
                }
            }
        }

        for (int i = 0; i < stack.size(); i++) { //스택에 남은 알파벳 순서대로 출력
            ans += stack.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
