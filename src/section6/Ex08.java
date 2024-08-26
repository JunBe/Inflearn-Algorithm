package section6;

import java.util.Arrays;
import java.util.Scanner;

//이분검색
public class Ex08 {
    public static int solution(int N, int M, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            if (arr[i] == M) {
                return i + 1;
            }
        }
        return 0;
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
