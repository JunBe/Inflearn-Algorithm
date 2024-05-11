package section3;

import java.util.Scanner;
//연속 부분수열

public class Ex04 {
    public static int solution(int N, int M, int[] arr) {
        int ans = 0;
        for (int i = 0; i < N; i++) { //arr 도는 루프
            int sum = 0;
            int j = 0;
            while (sum < M && (i + j) < arr.length) { //sum이 M을 넘지 않을 때까지 인덱스 i부터 차례로 계속 더한다.
                sum += arr[i + j];
                j++;
                if (sum == M) { //값을 찾으면 ans 카운트, 만약 sum 넘었으면 그냥 while문 종료
                    ans++;
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
