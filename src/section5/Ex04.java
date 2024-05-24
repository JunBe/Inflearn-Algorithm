package section5;

import java.util.Scanner;
import java.util.Stack;
//후위식 연산
public class Ex04 {
    public static int solution(String str) {
        int ans=0;
        Stack<Integer> stack = new Stack<>();

        for (Character x : str.toCharArray()) {
            if ('0' <= x && x <= '9') { //숫자라면 스택에 추가
                stack.push(x - '0');
            } else { // 연산자 일시
                if (stack.size() >= 2) { //숫자가 2개 이상 있어야 연산이 가능함
                    int sum = 0;
                    switch (x) {
                        case '+':
                            sum = stack.get(stack.size() - 2) + (stack.get(stack.size() - 1));
                            stack.pop();
                            stack.pop();
                            stack.push(sum);
                            break;
                        case '-':
                            sum = stack.get(stack.size() - 2) - stack.get(stack.size() - 1);
                            stack.pop();
                            stack.pop();
                            stack.push(sum);
                            break;
                        case '*':
                            sum = stack.get(stack.size() - 2)  * (stack.get(stack.size() - 1));
                            stack.pop();
                            stack.pop();
                            stack.push(sum);
                            break;
                        case '/':
                            sum = stack.get(stack.size() - 2)  / stack.get(stack.size() - 1);
                            stack.push(sum);
                            stack.pop();
                            stack.pop();
                            break;
                    }
                }
            }
        }
        ans = stack.get(0);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
