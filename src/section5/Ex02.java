package section5;

import java.util.Scanner;
import java.util.Stack;

//괄호문자제거
public class Ex02 {

    public static String solution(String str) {
        String ans="";
        Stack<Character> stack = new Stack<>();
        for (Character x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else if (x == ')') {
                if (stack.isEmpty()) { //괄호 밖인 경우
                    ans += x;
                } else { //닫을 괄호가 남았을 경우
                    stack.pop();
                }
            } else { //그냥 문자인 경우
                if (stack.isEmpty()) { //괄호 밖인 경우
                    ans += x;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
