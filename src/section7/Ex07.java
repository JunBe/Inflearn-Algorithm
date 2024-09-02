package section7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex07 {
    public static void BFS(Node root) {
        Deque<Node> Q = new ArrayDeque<>();
        int L = 0;
        Q.offer(root);
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            L++;
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.lt = new Node(2);
        node.rt = new Node(3);
        node.lt.lt = new Node(4);
        node.lt.rt = new Node(5);
        node.rt.lt = new Node(6);
        node.rt.rt = new Node(7);
        BFS(node);
    }
}
