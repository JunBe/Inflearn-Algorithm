package section1;

import java.util.Scanner;

//문자 찾기
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("문자열을 입력하시오.");
        String str1 = sc.next();
        System.out.println("찾을 문자를 입력하시오.");
        String str2 = sc.next();
        int value = str2.charAt(0);
        if (str2.charAt(0) >= 'a') {
            value = str2.charAt(0) - 32;
        }
        for (int i = 0; i < str1.length(); i++) { //C = 67 c=99 32차이임

            if (str1.charAt(i) == value || str1.charAt(i) == value + 32) {
                count++;
            }
        }

        System.out.println(count);

        //.toUpperCase()를 쓰면 다 대문자로 바뀐다


    }
}
