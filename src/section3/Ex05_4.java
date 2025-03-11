package section3;

import java.util.Scanner;

public class Ex05_4 {
    public static int solution(int N) {
        int lt = 1;
        int ans = 0;

        int sum = 0;

        for (int rt = 1; rt < N; rt++) {
            sum += rt;

            while (sum > N) {
                sum -= lt;
                lt++;
            }

            if (sum == N) {
                sum -= lt;
                ans++;
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
