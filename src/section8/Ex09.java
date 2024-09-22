package section8;

import java.util.Scanner;

//조합 구하기
public class Ex09 {
    static int N, M;
    static int[] arr,ch;

    private static void DFS(int L) {
        if (L == M) {
            //arr 출력
            for (int val : arr) {
                if (val > 0) {
                    System.out.print(val+" ");
                }
            }
            System.out.println();
            return;
        } else {
            for (int i = 1; i <= N; i++) {
                if (ch[i] == 0) {
                    if (arr[L] > i) {
                        continue;
                    }
                    ch[i] = 1;
                    arr[L + 1] = i;
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N + 1];
        ch = new int[N + 1];

        DFS(0);
    }
}
