package section7;
//Tree 말단노드까지의 가장 짧은 경로(DFS)
public class Ex09_2 {
    public static int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.lt = new Node(2);
        node.rt = new Node(3);
        node.lt.lt = new Node(4);
        node.lt.rt = new Node(5);

        System.out.println(DFS(0, node));
    }
}
