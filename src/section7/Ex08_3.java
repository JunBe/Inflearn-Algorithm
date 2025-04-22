package section7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex08_3 {
    static int[] dis = {-1, 1, 5};
    static int[] ch = new int[10001];

    public static int solution(int S, int E) {
        Deque<Integer> queue = new ArrayDeque<>();
        int level = 0;
        queue.offer(S);
        ch[S] = 1;

        while (!queue.isEmpty()) {
            int len = queue.size();//3
            for (int i = 0; i < len; i++) {
                int cur = queue.poll();
                if (cur == E) {
                    return level;
                }

                for (int j = 0; j < dis.length; j++) {
                    int val = cur + dis[j];
                    if (val < 10001 && val >= 0 && ch[val] == 0) {
                        ch[val] = 1;
                        queue.offer(val);
                    }
                }
            }
            level++;
        }

        return level;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();

        System.out.println(solution(S, E));
    }
}
