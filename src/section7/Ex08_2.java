package section7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//송아지 찾기 BFS
public class Ex08_2 {
    static int[] dis = {-1, 1, 5};
    static int[] ch;
    public static int BFS(int S, int E) {
        int L = 0;
        ch = new int[10001];
        Deque<Integer> Q = new ArrayDeque<>();
        Q.offer(S);
        ch[S] = 1;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int cur = Q.poll();
                if (cur == E) {
                    return L;
                }
                for (int j = 0; j < 3; j++) {
                    int nx = cur + dis[j];
                    if (nx > 0 && nx <= 10001 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // 현수의 위치
        int E = sc.nextInt(); // 송아지의 위치

        System.out.println(BFS(S, E));

    }
}
