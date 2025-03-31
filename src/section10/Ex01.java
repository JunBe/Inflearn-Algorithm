package section10;

import java.util.Scanner;

// 계단 오르기
public class Ex01 {
    public static int solution(int N) {
        //7 = 2 + 2 + 2 + 1
        //  = 2 + 2 + 1 + 2
        // 1 => 1가지
        // 2 => (1) + 1
        // 3 => 2까지 간다음에 1칸 상승 은 (2) 1에서 2칸상승 (1)
        // 4 => 3에서 1칸상승에 2에서 2칸 상승
        // 5 => (3)에서 2칸 상승 (4)에서 1칸상승
        int[] arr = new int[N + 1];
        arr[1] = 1;
        arr[2] = arr[1] + 1;
        for (int i = 3; i <= N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[N];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(solution(N));
    }
}
