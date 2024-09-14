package section8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
//동전 교환
public class Ex05 {
    static int BFS(int n, int M, int[] arr) {
        Deque<Integer> Q = new ArrayDeque<>();
        int L = 0;
        for (int i = 0; i < n; i++) {
            Q.offer(arr[i]);
        }
        L++;
        if (Q.contains(M)) {
            return L;
        }

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int cur = Q.poll();
                for (int j = 0; j < n; j++) {
                    Q.offer(cur + arr[j]);
                }
            }
            L++;
            if (Q.contains(M)) {
                return L;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        System.out.println(BFS(N, M, arr));
    }
}
