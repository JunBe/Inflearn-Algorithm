package section6;

import java.util.Scanner;

//삽입 정렬
public class Ex03 {

    public static void solution(int N, int[] arr) {
        for (int i = 0; i < N - 1; i++) { // 1 2 3 4 6 3
            for (int j = i + 1; j < N; j++) { // 1 2 3 4 5 / j<6
                if (arr[i] > arr[j]) {
                    int tmp = arr[j];
                    for (int k = j; k > i; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[i] = tmp;
                }
            }
        }

        //정답
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        solution(N,arr);
    }
}
