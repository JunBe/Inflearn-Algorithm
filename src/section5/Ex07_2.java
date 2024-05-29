package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//교육과정 설계 다른 풀이
public class Ex07_2 {

    public static String solution(String str1, String str2) {
        String ans = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (Character x : str1.toCharArray()) {
            queue.offer(x);
        }

        for (Character x : str2.toCharArray()) {
            if (queue.contains(x)) { //queue에 x가 있을 때
                if (queue.peek() == x) { //문자가 같으면 제거
                    queue.poll();
                } else { // 문자가 다르면 순서가 다른 것이므로 NO 리턴
                    return "NO";
                }
            }
        }

        if (queue.size() != 0) { //queue에 문자가 남아있다면 필수과목을 전체 다 이수한 것이 아님.
            ans = "NO";
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution(str1,str2));
    }
}
