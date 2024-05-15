package section4;

import java.util.HashMap;
import java.util.Scanner;

//모든 아나그램 찾기
public class Ex04 {
    public static int solution(String S, String T) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int lt = 0;
        for (int i = 0; i < T.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
            map2.put(T.charAt(i),map2.getOrDefault(T.charAt(i), 0) + 1);
        }

        boolean tf = true;
        for (Character key : map2.keySet()) {
            if (map.get(key) != map2.get(key)) {
                tf = false;
            }
        }

        if (tf) {
            ans++;
        }

        for (int rt = T.length(); rt < S.length(); rt++) {
            map.put(S.charAt(lt), map.get(S.charAt(lt)) - 1);
            map.put(S.charAt(rt), map.getOrDefault(S.charAt(rt), 0) + 1);
            lt++;
            tf = true;
            for (Character key : map2.keySet()) {
                if (map.get(key) != map2.get(key)) {
                    tf = false;
                }
            }
            if (tf) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        System.out.println(solution(S,T));
    }
}
