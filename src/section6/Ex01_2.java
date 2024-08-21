package section6;

import java.util.Scanner;

//선택 정렬2
public class Ex01_2 {

    public static void solution(int N, int[] arr) {
        for (int i = 0; i < N - 1; i++) { // 0 1 2 3 4
            int idx = i;
            for (int j = i + 1; j < N; j++) { // 1 2 3 4 5 , 2 3 4 5 , 3 4 5, 4 5, 5
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
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
