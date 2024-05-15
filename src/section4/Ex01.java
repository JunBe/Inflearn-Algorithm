package section4;

import java.util.HashMap;
import java.util.Scanner;
//학급 회장
public class Ex01 {
    public static char solution(int n, String candidate) {
        char ans=' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : candidate.toCharArray()) { //후보자들 char 배열로 반들어서 향상된 for문 사용
            //키 값이 있었다면 그 값 출력 후 1 카운트, 없었다면 0으로 초기화 후 1 카운트
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) { //key들 출력
            if (map.get(key) > max) { //key의 value가 max보다 크다면 조건문 실행
                max = map.get(key); //value값 최댓값에 저장
                ans = key; //최대값의 key 정답에 저장
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String candidate = sc.nextLine();
        System.out.println(solution(n, candidate));
    }
}
