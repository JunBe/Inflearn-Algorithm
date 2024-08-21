package section6;

import java.util.Scanner;

//삽입 정렬2
public class Ex03_2 {

    public static void solution(int N, int[] arr) {
        for (int i = 0; i < N - 1; i++) {
            int tmp = arr[i + 1], j;
            for (j = i; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
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
