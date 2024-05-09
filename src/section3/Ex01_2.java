package section3;

import java.util.ArrayList;
import java.util.Scanner;
//두 배열 합치기 다른 풀이
public class Ex01_2 {

    public static ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < N && p2 < M) { //p1이나 p2 둘중 하나가 배열을 끝까지 돌면 반복문 끝
            if (arr1[p1] < arr2[p2]) {
                ans.add(arr1[p1++]);
            } else {
                ans.add(arr2[p2++]);
            }
        }
        while (p1 < N) {
            ans.add(arr1[p1++]);
        }

        while (p2 < M) {
            ans.add(arr2[p2++]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int s : solution(N, M, arr1, arr2)) {
            System.out.print(s+" ");
        }

    }
}
