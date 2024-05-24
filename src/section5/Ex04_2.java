package section5;

import java.util.Scanner;
import java.util.Stack;

//후위식 연산 다른풀이
public class Ex04_2 {
    public static int solution(String str) {
        int ans=0;
        Stack<Integer> stack = new Stack<>();

        for (Character x : str.toCharArray()) {
            if (Character.isDigit(x)) { //숫자라면 스택에 추가
                stack.push(x - '0');
            } else { // 연산자 일시
                if (stack.size() >= 2) { //숫자가 2개 이상 있어야 연산이 가능함
                    int lt = 0;
                    int rt = 0;
                    switch (x) {
                        case '+':
                            rt = stack.pop();
                            lt = stack.pop();
                            stack.push(lt + rt);
                            break;
                        case '-':
                            rt = stack.pop();
                            lt = stack.pop();
                            stack.push(lt - rt);
                            break;
                        case '*':
                            rt = stack.pop();
                            lt = stack.pop();
                            stack.push(lt * rt);
                            break;
                        case '/':
                            rt = stack.pop();
                            lt = stack.pop();
                            stack.push(lt / rt);
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
