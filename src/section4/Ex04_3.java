package section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04_3 {
    public static int solution(String S, String T) {
        int ans = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (Character c : T.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < T.length() - 1; i++) {
            map2.put(S.charAt(i), map2.getOrDefault(S.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = T.length() - 1; rt < S.length(); rt++) {
            map2.put(S.charAt(rt), map2.getOrDefault(S.charAt(rt), 0) + 1);
            if (map2.equals(map)) {
                ans++;
            }

            if (map2.get(S.charAt(lt)) == 1) {
                map2.remove(S.charAt(lt));
            } else {
                map2.put(S.charAt(lt), map2.get(S.charAt(lt)) - 1);
            }
            lt++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

        System.out.println(solution(S, T));
    }
}
