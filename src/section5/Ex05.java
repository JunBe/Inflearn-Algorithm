package section5;

import java.util.Scanner;
import java.util.Stack;

//쇠막대기
public class Ex05 {

    public static int solution(String str) {
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                if (str.charAt(i - 1) == '(') { //() 인 경우 : 레이저 발사
                    stack.pop();
                    ans += stack.size(); //남은 막대기는 스택의 ( 수 이므로 막대기 왼쪽 조각들만 ans에 카운트 해준다
                } else { // )) 인 경우 맨 위의 막대기 삭제
                    stack.pop();
                    ans += 1; // 삭제할 막대기의 ans에 추가 안된 조각을 카운트 해준다.
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
