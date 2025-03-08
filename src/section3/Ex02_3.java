package section3;

import java.util.*;

public class Ex02_3 {
    public static List<Integer> solution(int[] A, int[] B, int N, int M) {
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(A);
        Arrays.sort(B);

        int x = 0, y = 0;

        while (x < N && y < M) {
            if (A[x] == B[y]) {
                ans.add(A[x]);
                x++;
                y++;
            } else if (A[x] < B[y]) {
                x++;
            } else {
                y++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        List<Integer> arr = solution(A, B, N, M);

        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}
