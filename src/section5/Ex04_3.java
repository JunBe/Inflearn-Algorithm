package section5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex04_3 {
    public static int solution(String string) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (char c : string.toCharArray()) {
            if ('0' <= c && c <= '9') {
                stack.push(c - 48);
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch(c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }

        }

        return stack.pop();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
