package section3;

import java.util.Scanner;
//최대 매출
public class Ex03 {
    public static int solution(int N, int K, int[] arr) {
        int ans = 0;

        int[] sum = new int[N - K + 1];
        for (int i = 0; i < K; i++) { //sum[0]에 합 입력
            sum[0] += arr[i];
        }

        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] - arr[i - 1] + arr[K + i - 1];//앞의 인덱스 합에서 맨 첫자리 빼고 그 다음자리 수 더하기
        }

        for (int i = 0; i < N - K + 1; i++) { //최댓값 구하기
            if (sum[i] > ans) {
                ans = sum[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(N, K, arr));
    }
}
