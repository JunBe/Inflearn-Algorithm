package section1;

import java.util.Scanner;

public class Ex12 {
    public static String solution(int n, String str) {
        String str2="";
        String ans = "";
        int num;

        // #->1 *->0 으로 바꿔서 str에 저장
        str = str.replace('#', '1');
        str = str.replace('*', '0');

        for (int i = 0; i < n; i++) { //0~6 7~13
            for (int j = i * 7; j < i * 7 + 7; j++) {
                str2 += str.charAt(j);
            }
            int tmp = Integer.parseInt(str2, 2);
            num = Integer.parseInt(str2.replace(str2, Integer.toString(tmp)));
            ans += (char)tmp;
            str2 ="";
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine(); //알파벳 대문자, 한 알파벳 문자마자 # 또는 *이 일곱개 #: 1 *: 0
        //1.if) #*****# -> 1000001
        //2. 10진수화 함 위의 1번 예는 65
        //3. 정수를 아스키코드 문자로 변환 65->'A'
        // if) #****## #**#### #**#### #**##** -> 1000011 1001111 1001111 1001100 / 67 79 79 76
        System.out.println(solution(n,str));

    }
}
