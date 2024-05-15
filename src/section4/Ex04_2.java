package section4;

import java.util.HashMap;
import java.util.Scanner;

//모든 아나그램 찾기 다른 풀이
public class Ex04_2 {
    public static int solution(String S, String T) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int lt = 0;
        for (char c : T.toCharArray()) { //map2에 T의 문자들의 개수를 키,값으로 저장해둔다.
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < T.length() - 1; i++) { //T전체 개수-1 만큼 미리 map에 S를 저장해둔다.
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }

        for (int rt = T.length() - 1; rt < S.length(); rt++) {
            map.put(S.charAt(rt), map.getOrDefault(S.charAt(rt), 0) + 1); //인덱스 rt값을 map에 추가해준다.
            if (map.equals(map2)) { //map과 map2의 키,값이 모두 동일하다면 ans 카운트
                ans++;
            }
            if (map.get(S.charAt(lt)) >= 2) { //2이상이라면 삭제하면 2개가 사라지는 것이므로 1개만 줄인다.
                map.put(S.charAt(lt), map.get(S.charAt(lt)) - 1);
            } else { //1이라면 삭제, 1이하라면 존재가 불가
                map.remove(S.charAt(lt));
            }
            lt++;//lt를 오른쪽으로 한칸 민다.

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
