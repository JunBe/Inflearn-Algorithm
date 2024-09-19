package section8;

import java.util.Scanner;

public class Ex07_3 {
    static int sum = 0;
    static int[][] arr;
    private static int DFS(int n, int r) {
        if (arr[n][r] != 0) {
            return arr[n][r];
        }

        if (r == 0 || r == n) {
            return 1;
        } else {
            arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }

        return arr[n][r];
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
