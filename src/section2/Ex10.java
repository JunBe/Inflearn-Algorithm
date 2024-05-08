package section2;

import java.util.Scanner;

//봉우리
public class Ex10 {
    public static int solution(int N, int[][] arr) {
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                //상하좌우보다 자신이 크다면 ans 1 증가
                if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j]) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N + 2][N + 2];
        //11 ~ 55
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N,arr));
    }
}
