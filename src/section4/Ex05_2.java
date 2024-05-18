package section4;

import java.util.*;

//K번째 큰 수 다른 풀이
public class Ex05_2 {
    public static int solution(int N, int K, int[] arr) {
        int ans = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 기본적으로 오름차순이지만 reverseOrder를 이용하여 내림차순으로 정
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    Tset.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        int cnt = 0;
        for (Integer x : Tset) {
            cnt++;
            if (cnt == K) {
                return x; //K번째 수 리턴
            }
        }

        return ans; //K값이 존재 안하면 -1 리턴
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N,K,arr));
    }
}
