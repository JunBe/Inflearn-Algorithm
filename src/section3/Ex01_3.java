package section3;

import java.util.Scanner;

public class Ex01_3 {
    private static int[] solution(int[] arr1, int[] arr2, int N, int M) {
        int[] ans = new int[N + M];
        int lp = 0, rp = 0;
        int np = 0;
        for (int i = 0; i < N + M; i++) {
            if (N == lp) {
                ans[np++] = arr2[rp++];
                continue;
            }

            if (M == rp) {
                ans[np++] = arr1[lp++];
                continue;
            }

            if (arr1[lp] >= arr2[rp]) {
                ans[np++] = arr2[rp++];
            } else {
                ans[np++] = arr1[lp++];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] ans = solution(arr1, arr2, N, M);
        for(int val : ans){
            System.out.print(val + " ");
        }
    }
}
