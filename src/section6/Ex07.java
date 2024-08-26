package section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//좌표 정렬
public class Ex07 {
    public static int[][] solution(int N, int[][] arr) {
        int[][] tmp = new int[1][2];
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    tmp[0][0] = arr[j + 1][0];
                    tmp[0][1] = arr[j + 1][1];
                    arr[j + 1][0] = arr[j][0];
                    arr[j + 1][1] = arr[j][1];
                    arr[j][0] = tmp[0][0];
                    arr[j][1] = tmp[0][1];
                } else if ((arr[j][0] == arr[j + 1][0]) && (arr[j][1] > arr[j + 1][1])) {
                    tmp[0][1] = arr[j + 1][1];
                    arr[j + 1][1] = arr[j][1];
                    arr[j][1] = tmp[0][1];
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int ans[][] = solution(N, arr);
        for (int i = 0; i < N; i++) {
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
    }
}
