package section3;

import java.util.Scanner;

public class Ex03_1 {
    public static int solution(int N, int K, int[] arr) {
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }

        int max = sum;
        for (int i = 0; i < N - K - 1; i++) {
            sum = sum - arr[i] + arr[i + K];
            max = Math.max(max, sum);
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
