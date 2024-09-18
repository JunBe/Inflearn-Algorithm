package section8;

import java.util.Scanner;

public class Ex06 {
    static int[] ans, arr;
    static int N, M;
    static void DFS(int L) {
        if (L == M) {
            for (int val : ans) {
                System.out.print(val + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < N; i++) {
                boolean flag = true;
                for (int j = 0; j < L; j++) {
                    if (ans[j] == arr[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans[L] = arr[i];
                    DFS(L + 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }//1 3 6 9 / 3개
        ans = new int[M];
        DFS(0);
    }
}
