package section1;

import java.util.Scanner;

public class Ex09_2 {
    public static int solution(String str) {
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                answer = answer * 10 + (str.charAt(i) - '0');
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
