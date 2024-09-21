package section8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    static int[] arr;
    static int[] ch;
    static int N, F;
    static boolean flag = false;

    private static void DFS(int L) {
        if (flag) {
            return;
        }
        if (L == N) {
            if (solution() == F) {
                flag = true;
                for (int val : arr) {
                    System.out.print(val+" ");
                }
            }
            return;
        } else {
            for (int i = 1; i <= N; i++) {
                if (ch[i] == 0) {
                    arr[L] = i;
                    ch[i] = 1;
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    private static int solution() {
        int[] sum = new int[N];
        for (int i = 0; i < N; i++) {
            sum[i] = arr[i];
        }
        int len = N-1;
        while (len > 0) {
            for (int i = 0; i < len; i++) {
                sum[i] = sum[i] + sum[i + 1];
            }
            len--;
        }
//        System.out.println(Arrays.toString(sum));

        return sum[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        F = sc.nextInt();
        arr = new int[N];
        ch = new int[N + 1];

        DFS(0);
    }
}
