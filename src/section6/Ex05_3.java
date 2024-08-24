package section6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05_3 {
    public static String solution(int N, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for (Integer val : map.values()) {
            if (val > 1) {
                return "D";
            }
        }

        return "U";//중복 : D , 중복X : U
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(N, arr));
    }
}
