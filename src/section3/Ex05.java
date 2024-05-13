package section3;

import java.util.Scanner;

public class Ex05 {
    public static int solution(int N) {
        int ans = 0;
        //2개의 자연수를 뽑아 답을 구한다해도 홀수의 경우 (N/2)+(N/2+1) 의 경우가 최대이므로 N/2+1까지만 루프
        for (int i = 1; i <= N / 2 + 1; i++) {
            int sum = 0;

            //i부터 차례로 카운트해서 더하며 sum이 N을 넘지 않을 때 까지 반복
            //만약 sum==N을 충족 못 시키면 ans 카운트 없이 그냥 넘어간다
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
