package section6;

import java.util.Arrays;
import java.util.Scanner;

//마구간 정하기
public class Ex10 {
        public static int solution(int N, int C, int[] arr) {
            int ans = 0;
            Arrays.sort(arr); //0 1 9 11 13 14 -> 1 8 2 2 1
            int lt = 0;
            int rt = arr[N - 1];
            while (lt <= rt) {
                int ep = arr[0];
                int cnt = 1;
                int mid = (lt + rt) / 2;
                for (int i = 0; i < N; i++) {
                    if (arr[i] - ep >= mid) {
                        ep = arr[i];
                        cnt++;
                    }
                    if (cnt == C) {
                        break;
                    }
                }

                if (cnt >= C) {
                    ans = mid;
                    lt = mid + 1;
                } else {
                    rt = mid - 1;
                }
            }
            return ans;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(N, C, arr));
    }
}
