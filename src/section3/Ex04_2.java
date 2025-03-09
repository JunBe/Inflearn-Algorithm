package section3;

import java.util.Scanner;
//연속 부분수열 다른 풀이

public class Ex04_2 {
    public static int solution(int N, int M, int[] arr) {
        int ans = 0;
        int lt = 0, rt = 0;
        int sum = 0;

        while (rt < N) {
            if (sum == M) { //값을 찾았을 때 ans카운트 후 lt 한칸 올리며 lt값을 빼준다
                ans++;
                sum -= arr[lt++];
            } else if (sum > M) {  //M 초과했을 경우 -> lt 한칸 올려주며 그 전 lt값 빼주기
                while (sum > M) {
                    sum -= arr[lt++];
                }
            } else { //M보다 작을 때 -> 현재 arr[rt]값을 더한 후 rt카운트
                sum += arr[rt++];
                if (rt == N) {
                    while (sum > M) {
                        sum -= arr[lt++];
                    }
                    if (sum == M) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, arr));
    }
}
