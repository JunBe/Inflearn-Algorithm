package section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Least Recently Used
public class Ex04_2 {
    public static int[] solution(int S, int N, int[] arr) {
        int[] memory = new int[S];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            boolean tf = false;
            int findIdx = 0;
            for (int j = 0; j < S; j++) { //메모리에 캐시가 이미 있는지 확인
                if (memory[j] == arr[i]) {
                    tf = true;
                    findIdx = j;
                }
            }
            if (tf) { //Cache Hit
                for (int k = findIdx; k < idx - 1; k++) {
                    memory[k] = memory[k + 1];
                }
                memory[idx - 1] = arr[i];
            } else { //Cache Miss
                if (idx < S) {
                    memory[idx++] = arr[i];
                } else {
                    for (int k = 0; k < S - 1; k++) {
                        memory[k] = memory[k + 1];
                    }
                    memory[S - 1] = arr[i];
                }
            }
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

        for (int i = S - 1; i >= 0; i--) {
            System.out.print(solution(S, N, arr)[i] + " ");
        }
    }
}
