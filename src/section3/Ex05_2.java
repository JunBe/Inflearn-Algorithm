package section3;

import java.util.Scanner;
//연속된 자연수의 합 (투포인터)

public class Ex05_2 {
    public static int solution(int N) {
        int ans = 0;
        int lt = 1;
        int sum = 0;
        for (int rt = 1; rt <= N / 2 + 1; rt++) {
            sum += rt;
            while (sum >= N) {
                if (sum == N) {
                    ans++;
                }
                sum -= lt;
                lt++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));

    }
}
