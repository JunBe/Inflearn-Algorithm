package section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01_2 {
    public static char solution(int N, char[] arr) {
        Map<Character, Integer> map = new HashMap<>();

        for (char val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        char winner= ' ';
        int max = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                winner = key;
            }
        }

        return winner;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        char[] arr = new char[N];

        for (int i = 0; i < N; i++) {
            arr[i] = s.charAt(i);
        }

        System.out.println(solution(N, arr));
    }
}
