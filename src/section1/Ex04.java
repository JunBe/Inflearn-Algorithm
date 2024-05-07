package section1;

import java.util.Scanner;

//단어 뒤집기
public class Ex04 {

    public static void solution(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 단어의 개수
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            solution(str);
        }

    }
}
