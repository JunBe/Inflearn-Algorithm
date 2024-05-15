package section4;

import java.util.HashMap;
import java.util.Scanner;

//아나그램 다른 풀이
public class Ex02_2 {
    public static String solution(String s1, String s2) {
        String ans = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        //map에 단어별로 개수 카운트
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            //c가 map에 존재하지 않거나 c의 값이 0이면 NO리턴
            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            }
            //c가 0일 때 리턴하는 이유 : c가 0일경우 1을 뺐을 때 -1이 되기 때문
            //-1 의 의미 : 중복되는 숫자가 1개 더 많다
            map.put(c, map.get(c) - 1);
        }
        //정상적으로 다 넘어왔으면 아나그램이므로 YES 리턴
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(solution(s1, s2));

    }
}
