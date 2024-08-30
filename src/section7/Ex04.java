package section7;

import java.util.Scanner;
//피보나치 (재귀)
public class Ex04 {
    public static int DFS(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return DFS(n - 1) + DFS(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(DFS(i) + " ");
        }
    }
}
