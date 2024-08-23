package section6;

import java.util.Scanner;

// Least Recently Used 다른 풀이
public class Ex04_3 {
    public static int[] solution(int S, int N, int[] arr) {
        int[] memory = new int[S];
        for (int val : arr) {
            int idx = -1;
            for (int i = 0; i < S; i++) {
                if (val == memory[i]) {
                    idx = i;
                }
            }

            if (idx == -1) {
                for (int i = S - 1; i > 0; i--) {
                    memory[i] = memory[i - 1];
                }
            } else {
                for (int i = idx; i > 0; i--) {
                    memory[i] = memory[i - 1];
                }
            }
            memory[0] = val;
        }
        return memory;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : solution(S, N, arr)) {
            System.out.print(i+" ");
        }
    }
}
