package section5;

import java.util.*;

public class Ex02_3 {
    public static List<Character> solution(String s){
        Deque<Character> stack = new ArrayDeque<>();
        List<Character> ans = new ArrayList<>();

        for(Character c : s.toCharArray()){
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    ans.add(c);
                } else if (c == ')') {
                    stack.pop();
                }
            }
        }

        return ans; //EFLM
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (char c : solution(s)) {
            System.out.print(c);
        }
    }
}
