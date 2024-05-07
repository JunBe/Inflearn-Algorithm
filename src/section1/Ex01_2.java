package section1;

import java.util.Scanner;

//문자 찾기
public class Ex01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("문자열을 입력하시오.");
        String str1 = sc.next();
        System.out.println("찾을 문자를 입력하시오.");
        String str2 = sc.next();

        //모두 대문자로 변경
        str1 = str1.toUpperCase();
        char c = str2.charAt(0);
        c = Character.toUpperCase(c);

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == c) {
                count++;
            }
        }

        System.out.println(count);

    }
}
