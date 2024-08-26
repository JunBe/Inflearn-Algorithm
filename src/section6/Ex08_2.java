package section6;

import java.util.Arrays;
import java.util.Scanner;

//이분검색
public class Ex08_2 {
    public static int solution(int N, int M, int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        int lt = 0;
        int rt = N - 1;
        while (lt<=rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == M) {
                ans = mid + 1;
                break;
            } else if (arr[mid] > M) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(N, M, arr));
    }
}
