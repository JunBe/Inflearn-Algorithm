package section3;

import java.util.Scanner;

public class Ex05 {
    public static int solution(int N) {
        int ans = 0;
        for (int i = 1; i <= N / 2 + 1; i++) {
            int sum = 0;
            for (int j = i; sum < N; j++) {
                sum += j;
                if (sum == N) {
                    ans++;
                }
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
