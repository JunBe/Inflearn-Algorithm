package section7;

import java.util.Scanner;

//피보나치 (배열)
public class Ex04_2 {
    static int[] fibo;
    public static int DFS(int n) {
        if (n <= 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 1) + DFS(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fibo = new int[N + 1];
        DFS(N);
        for (int i = 1; i <= N; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
