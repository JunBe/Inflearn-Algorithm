package section2;

import java.util.Scanner;

public class Ex09 {
    public static int solution(int N, int[][] arr) {
        int ans=-1;
        int sum;

        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[i][j];
            }
            if (ans < sum) {
                ans = sum;
            }
        }

        for (int i = 0; i < N; i++) {
            sum = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[j][i];
            }
            if (ans < sum) {
                ans = sum;
            }
        }


        sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i][i];
        }
        if (ans < sum) {
            ans = sum;
        }

        sum = 0; //[4][0] [3][1] [2][2] [1][3] [0][4]
        for (int i = N-1; i >= 0; i--) {
            sum += arr[i][N - 1 - i];
        }
        if (ans < sum) {
            ans = sum;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N, arr));
    }
}
