package section1;

import java.util.Scanner;

public class Ex11 {
    public static String solution(String str) {
        String ans = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (i == 0) {
                ans += str.charAt(i);
            } else {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    if (count != 0) {//ans에 숫자 추가
                        count++;
                        ans += Integer.toString(count);
                        count = 0;
                    }
                    ans += str.charAt(i);
                }
            }
        }
        count++;
        ans += Integer.toString(count);


        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //if AAABCCCCDD -> A3BC4D2
        System.out.println(solution(str));
    }
}
