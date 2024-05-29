package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//교육과정 설계
public class Ex07 {

    public static String solution(String str1, String str2) {
        String ans = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (Character x : str2.toCharArray()) {
            for (Character y : str1.toCharArray()) {
                if (y == x) { // str2를 돌며 str1의 원소와 같다면 그 원소를 queue에 추가시간다.
                    queue.offer(x);
                }
            }
        }

        for (Character x : str1.toCharArray()) { //str1와 queue의 값과 순서가 같아야한다.
            if (x != queue.poll()) { //값과 순서가 일치하지 않다면 NO 반환
                return "NO";
            }
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
