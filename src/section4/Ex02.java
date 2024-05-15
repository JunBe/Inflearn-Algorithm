package section4;

import java.util.HashMap;
import java.util.Scanner;

//아나그램
public class Ex02 {
    public static String solution(String s1, String s2) {
        String ans = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        //map1과 map2에 단어별로 개수 카운트
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Character key : map1.keySet()) {
            if (map1.get(key) != map2.get(key)) { //map1과 map2 key로 value를 비교해 다르면 NO 리턴
                return "NO";
            }
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
