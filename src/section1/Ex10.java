package section1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static int[] solution(String s, String t) {
        int[] ans = new int[s.length()];
        Arrays.fill(ans, 101); //ans의 모든 배열을 101로 초기화 해준다. (문자열 길이가 100이 넘지 않으므로)
        //s에서 t를 찾는다.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(0)) {
                ans[i] = 0;
            }
        }
        //만약 t가 3개 있다치면 첫번째t비교 2번째t비교 한후 더 작은 수 ans 배열에 대입
        for (int i = 0; i < s.length(); i++) {
            if (ans[i] == 0) {
                for (int j = 0; j < s.length(); j++) {
                    if (i > j) {
                        if (ans[j] > i - j) {
                            ans[j] = i - j;
                        }
                    } else {
                        if (ans[j] > j - i) {
                            ans[j] = j - i;
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        for (int sol : solution(s, t)) {
            System.out.print(sol + " ");
        }
    }
}
