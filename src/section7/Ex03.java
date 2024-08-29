package section7;

import java.util.Scanner;

public class Ex03 {
    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return DFS(n - 1) * n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(DFS(N));
    }
}
