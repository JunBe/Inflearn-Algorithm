package section7;

import java.util.Scanner;
//집합 구하기
class Node {
    public int data;
    public Node lt, rt;

    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}

public class Ex06 {

    public static int DFS(int n,Node root) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node node = new Node(1);
        DFS(N,node);
    }
}
