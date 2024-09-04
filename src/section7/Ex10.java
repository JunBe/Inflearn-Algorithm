package section7;

import java.util.ArrayDeque;
import java.util.Deque;

//Tree 말단노드까지의 가장 짧은 경로(BFS)
public class Ex10 {
    public static int BFS(int L, Node root) {
        Deque<Node> Q = new ArrayDeque<>();
        Q.offer(root);
        while (!Q.isEmpty()) {
            int n = Q.size();
            for (int i = 0; i < n; i++) {
                Node cur = Q.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                }
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.lt = new Node(2);
        node.rt = new Node(3);
        node.lt.lt = new Node(5);
        node.lt.lt.rt = new Node(6);
        node.rt.lt = new Node(4);
        System.out.println(BFS(0, node));
    }
}
