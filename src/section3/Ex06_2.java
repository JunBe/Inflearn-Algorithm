package section3;

import java.util.Scanner;

public class Ex06_2 {
    public static int solution(int N, int K, int[] arr) {
        int count = 0;
        int lt = 0;

        int max = 0;
        for (int rt = 0; rt < N; rt++) {
            if (arr[rt] == 0) {
                count++;
            }

            if (count > K) {
                max = Math.max(max, rt - lt);
                while (arr[lt] == 1) {
                    lt++;
                }

                count--;
                lt++;

            }

            if (rt == N - 1) {
                max = Math.max(max, rt - lt + 1);
            }

        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, K, arr));
    }
}
