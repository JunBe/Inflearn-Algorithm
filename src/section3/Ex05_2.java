package section3;

import java.util.Scanner;
//연속된 자연수의 합 (투포인터)

public class Ex05_2 {
    public static int solution(int N) {
        int ans = 0;
        int lt = 1; //left를 1로 둔다.
        int sum = 0;
        //2개의 자연수를 뽑아 답을 구한다해도 홀수의 경우 (N/2)+(N/2+1) 의 경우가 최대이므로 N/2+1까지만 루프
        for (int rt = 1; rt <= N / 2 + 1; rt++) {
            sum += rt; //루프 마다(rt가 증가할 때 마다) rt를 sum에 더해준다
            while (sum >= N) {
                if (sum == N) { //같을 경우는 ans를 카운트 해준다.
                    ans++;
                }
                //sum이 N보다 작아질 때 까지 left를 올려주며 sum에서 빼준다.
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
