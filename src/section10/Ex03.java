package section10;

import java.util.Scanner;

// 최대 부분 증가 수열
public class Ex03 {
    public static int solution(int[] arr, int N) {
        int ans = 0;
        int[] cnt = new int[N];
        cnt[0] = 1;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    cnt[i] = Math.max(cnt[j] + 1, cnt[i]);
                }
            }
            if (cnt[i] == 0) {
                cnt[i] = 1;
            }
        }

        for (int i : cnt) {
            ans = Math.max(ans, i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, N));

    }
}
