package section1;

import java.util.Scanner;

public class Ex11_2 {
    public static String solution(String str) {
        String ans = "";
        str += " ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                ans += str.charAt(i);
                if (count > 1) {
                    ans += String.valueOf(count);
                }
                count = 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //if AAABCCCCDD -> A3BC4D2
        System.out.println(solution(str));
    }
}
