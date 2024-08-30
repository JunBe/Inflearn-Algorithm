package section7;

import java.util.Scanner;

class Node {
    public int data;
    public Node lt, rt;

    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}

//이진트리 순회
public class Ex05 {
    public static void DFS(Node root) {
        if(root==null) return;
        else{
            DFS(root.lt);
            System.out.println(root.data);
            DFS(root.rt);

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
        DFS(node);
    }
}
