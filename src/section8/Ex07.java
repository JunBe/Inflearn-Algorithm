package section8;

import java.util.Scanner;

public class Ex07 {
    static int sum = 0;
    private static void DFS(int n, int r) {
        if (r == 0 || r == n) {
            sum++;
            return;
        } else {
            DFS(n - 1, r - 1);
            DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if (n / r < 2) {
            r = n - r;
        }
        DFS(n, r);
        System.out.println(sum);
    }
}
