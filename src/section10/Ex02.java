package section10;

import java.util.Scanner;

// 돌다리 건너기
public class Ex02 {
    public static int solution(int N) {
        int[] arr = new int[N + 1];

        arr[0] = 1;
        arr[1] = arr[0] + 1;
        for (int i = 2; i <= N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[N];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solution(N));
    }
}
