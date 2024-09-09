package section7;

import java.util.*;

//그래프 최단거리 (BFS 배열)
public class Ex13_2 {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ans;
    static int[] ch;
    private static int[] BFS(int v) {
        Deque<Integer> Q = new ArrayDeque<>();
        Q.offer(v);
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int cur = Q.poll();
                for (Integer val : graph.get(cur)) {
                    if (ch[val] == 0) {
                        Q.offer(val);
                        ch[val] = 1;
                        ans[val] = ans[cur] + 1;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[N + 1];
        ch[1] = 1;
        ans = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + ans[i]);
        }
    }

}
