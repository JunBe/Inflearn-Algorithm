package section8;

import java.util.Scanner;

public class Ex07_2 {
    static int sum = 0;
    static int[][] arr;
    private static void DFS(int n, int r) {
        if (arr[n][r] != 0) {
            return;
        }

        if (r == 0 || r == n) {
            arr[n][r] = 1;
            return;
        } else {
            DFS(n - 1, r - 1);
            DFS(n - 1, r);
            arr[n][r] = arr[n - 1][r - 1] + arr[n - 1][r];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        arr = new int[n + 1][n + 1];
        DFS(n, r);
        System.out.println(arr[n][r]);

    }
}
