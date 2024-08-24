package section6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//장난꾸러기
public class Ex06 {
    public static int[] solution(int N, int[] arr) {
        int[] ans = new int[2];
        int minIdx = 1;
        int maxIdx = 1;
        for (int i = N-1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                minIdx = i;
                break;
            }
        }

        for (int i = minIdx - 1; i >= 0; i--) {
            if (arr[minIdx] > arr[i]) {
                maxIdx = i + 1;
                while (arr[maxIdx] == arr[minIdx]) {
                    maxIdx++;
                }
                break;
            }
        }
        ans[0] = maxIdx + 1;
        ans[1] = minIdx + 1;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : solution(N, arr)) {
            System.out.print(i + " ");
        }
    }
}
