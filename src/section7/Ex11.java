package section7;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

//경로탐색 (DFS)
public class Ex11 {
    static int ans = 0;
    static int[][] graph;
    public static int DFS(int pos, int[] ch) {
        int N = graph.length - 1;
        if (pos == N) {
            ans++;
            ch[N] = 0;
            return ans;
        }

        for (int i = 1; i <= N; i++) {
            if (graph[pos][i] == 1 && ch[i] != 1) {
                ch[i] = 1;
                DFS(i, ch);
                ch[i] = 0;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        graph = new int[N + 1][N + 1];
        int[] ch = new int[N + 1];
        ch[1] = 1;
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        System.out.println(DFS(1, ch));
    }
}
