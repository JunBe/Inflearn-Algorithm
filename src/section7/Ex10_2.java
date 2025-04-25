package section7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex10_2 {
    public static int BFS(int L, Node root){
        Deque<Node> queue = new ArrayDeque<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                if (curNode.lt == null || curNode.rt == null) {
                    return L;
                }
                queue.offer(curNode.lt);
                queue.offer(curNode.rt);
            }
            L++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node node = new Node(1);
        node.lt = new Node(2);
        node.rt = new Node(3);
        node.lt.lt = new Node(4);
        node.lt.rt = new Node(5);
        int L = 0;
        System.out.println(BFS(L, node));
    }
}
