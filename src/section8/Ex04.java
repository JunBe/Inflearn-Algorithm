package section8;

import java.util.Scanner;

public class Ex04 {
    static int[] arr;

    static void DFS(int L, int N, int M) {

        if (L == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i = 1; i <= N; i++) {
                arr[L] = i;
                DFS(L + 1, N, M);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N];

        DFS(0, N, M);
    }
}
/*
1~N까지 번호 중복을 허락하여 M번 뽑아 일렬로 나열하는 방법 모두 출력
N : 3~10 M : 2~N
 */
