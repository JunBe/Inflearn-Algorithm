package section6;

import java.util.Scanner;

public class Ex01_3 {
    public static int[] solution(int N, int[] arr) {
        for (int i = 0; i < N; i++) {
            int min = Integer.MAX_VALUE;
            int idx = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }

            if (arr[i] > min) {
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int val : solution(N, arr)) {
            System.out.print(val + " ");
        }
    }
}
