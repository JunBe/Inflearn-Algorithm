package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_3 {

    public static ArrayList<String> solution(int n, String[] str) {

        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            int lt=0;
            int rt = x.length() - 1;
            char[] s = x.toCharArray();
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(s));
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
        }
        for (String s : solution(N,str)) {
            System.out.println(s);
        }
    }
}
