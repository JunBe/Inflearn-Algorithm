package section8;

import java.util.Scanner;

//합이 같은 부분집합
public class Ex01 {
    public static void DFS(int[] arr) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(arr);
    }
}
