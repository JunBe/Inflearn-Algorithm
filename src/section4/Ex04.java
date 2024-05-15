package section4;

import java.util.HashMap;
import java.util.Scanner;

//모든 아나그램 찾기
public class Ex04 {
    public static int solution(String S, String T) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        //map2에 T의 문자들의 개수를 키,값으로 저장해둔다.
        for (char key : T.toCharArray()) {
            map2.put(key, map2.getOrDefault(map2.get(key), 0) + 1);
        }

        for (int i = 0; i < T.length() - 1; i++) { //T전체 개수-1 만큼 미리 map에 S를 저장해둔다
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }

        boolean tf = true; //map이 map2와 같은지 판별하기 위해 tf 선언
        for (Character key : map2.keySet()) {
            if (map.get(key) != map2.get(key)) { // map의 key를 돌며 map2와 다르면 false를 반환한다. 
                tf = false;
            }
        }

        if (tf) { //만약 true였다면 ans 카운트
            ans++;
        }
        
        int lt = 0; //투 포인터를 쓰기위해 lt를 선언한다.

        //한칸씩 뒤로 밀어가며 위와 똑같은 방식으로 반복한다
        for (int rt = T.length(); rt < S.length(); rt++) {
            map.put(S.charAt(lt), map.get(S.charAt(lt)) - 1); //인덱스 lt의 값을 map에서 뺀다
            map.put(S.charAt(rt), map.getOrDefault(S.charAt(rt), 0) + 1); //인덱스 rt의 값을 추가한다.
            lt++; // lt 오른쪽으로 한 칸 밈

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
