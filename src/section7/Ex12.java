package section7;

import java.util.ArrayList;
import java.util.Scanner;

//경로탐색 (ArrayList)
public class Ex12 {
    static int ans = 0;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;
    public static int DFS(int v) {
        if (v == graph.size()) {
            ans++;
            return 0;
        } else {
            for (Integer val : graph.get(v)) {
                if (ch[val] == 0) {
                    ch[val] = 1;
                    DFS(val);
                    ch[val] = 0;
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
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[N + 1];
        ch[1] = 1;
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        System.out.println(graph);
        System.out.println(DFS(1));
    }
}
