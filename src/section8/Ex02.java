package section8;

import java.util.Scanner;
//바둑이 승차 (DFS)
public class Ex02 {
    static int C;
    static int[] arr;
    static int W = 0;
    private static int DFS(int L, int sum) {
        if (L == arr.length) {
            if (sum <= C) {
                W = Math.max(sum, W);
            }
        } else {
            DFS(L + 1, sum);
            DFS(L + 1, sum + arr[L]);
        }
        return W;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        int N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(DFS(0, 0));
    }
}
