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
                if (y == x) {
                    queue.offer(x);
                }
            }
        }

        for (Character x : str1.toCharArray()) {
            if (x != queue.poll()) {
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
