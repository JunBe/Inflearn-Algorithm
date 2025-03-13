package section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex03_2 {
    private static void solution(int N, int K, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        for (int rt = 0; rt < N; rt++) {
            int val = arr[rt];
            map.put(val, map.getOrDefault(val, 0) + 1);

            if (rt - lt > K - 2) {
                System.out.print(map.size() + " ");
                map.put(arr[lt], map.get(arr[lt]) - 1);
                if (map.get(arr[lt]) == 0) {
                    map.remove(arr[lt]);
                }
                lt++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        solution(N, K, arr);


    }
}
