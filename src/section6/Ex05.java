package section6;

import java.util.Scanner;
public class Ex05 {
    public static String solution(int N, int[] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    return "D";
                }
            }
            for (int j = i + 1; j < N; j++) {
                if (arr[j] == arr[i]) {
                    return "D";
                }
            }
        }
        return "U";//중복 : D , 중복X : U
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(N, arr));
    }
}
