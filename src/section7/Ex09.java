package section7;
//Tree 말단노드까지의 가장 짧은 경로(DFS)
public class Ex09 {
    static int L = -1;
    static int ans = Integer.MAX_VALUE;

    public static int DFS(Node root) {
        L++;
        if (root == null) {
            L--;
            if (ans > L) {
                ans = L;
            }
            return 0;
        } else {
            DFS(root.lt);
            DFS(root.rt);
            L--;
        }

        return ans;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.lt = new Node(2);
        node.rt = new Node(3);
        node.lt.lt = new Node(4);
        node.lt.rt = new Node(5);

        System.out.println(DFS(node));
    }
}
