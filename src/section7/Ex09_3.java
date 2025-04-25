package section7;

import java.util.Scanner;

public class Ex09_3 {
    static int level = -1;
    static int ans = Integer.MAX_VALUE;
    public static void solution(Node node){
        level++;

        if (node.lt == null && node.rt == null) {
            ans = Math.min(level, ans);
            level--;
            return;
        }

        solution(node.lt);
        solution(node.rt);
        level--;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node node = new Node(1);
        node.lt = new Node(2);
        node.rt = new Node(3);
        node.lt.lt = new Node(4);
        node.lt.rt = new Node(5);

        solution(node);
        System.out.println(ans);
    }
}
