package section6;

import java.util.Arrays;
import java.util.Scanner;

//뮤직 비디오
public class Ex09 {
    public static int solution(int N, int M, int[] arr) {
        int ans = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int sum = 0;
            int num = 1;
            for (int i = 0; i < N; i++) { //27
                if (sum + arr[i] > mid) {
                    sum = arr[i];
                    num++;
                } else {
                    sum += arr[i];
                }
            }
            if (num <= M) {
                rt = mid - 1;
                ans = mid;
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
