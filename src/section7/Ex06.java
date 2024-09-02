package section7;

import java.util.Scanner;
//집합 구하기
//class Node {
//    public int data;
//    public Node lt, rt;
//
//    public Node(int data) {
//        this.data = data;
//        this.lt = null;
//        this.rt = null;
//    }
//}

public class Ex06 {
    static int[] ch;
    static int N;

    public static void DFS(int L) {
        if (L == N + 1) {
            for (int i = 1; i < N + 1; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ch = new int[N + 1];
        DFS(1);
    }
}
