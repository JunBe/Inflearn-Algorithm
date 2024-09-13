package section8;

import java.util.Scanner;

//최대점수 구하기(DFS)
public class Ex03 {
    static int[][] arr;
    static int M;

    static int ans = Integer.MIN_VALUE;
    static void DFS(int L, int sumScore,int sumTime) {
        if (sumTime > M) {
            return;
        }
        ans = Math.max(ans, sumScore);
        if (L == arr.length) {
            return;
        } else {
            DFS(L + 1, sumScore, sumTime);
            DFS(L + 1, sumScore + arr[L][0], sumTime + arr[L][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        DFS(0, 0, 0);
        System.out.println(ans);
    }
}
