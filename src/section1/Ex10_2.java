package section1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_2 {
    public static int[] solution(String s, char t) {
        int[] ans = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                ans[i] = p;
            } else {
                p++;
                ans[i] = p;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                ans[i] = Math.min(p, ans[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        for (int sol : solution(s, t)) {
            System.out.print(sol + " ");
        }
    }
}
