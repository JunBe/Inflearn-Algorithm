package section2;

import java.util.Scanner;

public class Ex03_2 {

    public static char[] solution(int N, int[] A, int[] B) {
        char[] ans = new char[N];
        //전체 조합 2:짐,1:이김,0:동점,-1:짐,-2:이김

        for (int i = 0; i < N; i++) {
            if (A[i] - B[i] == 0) {
                ans[i] = 'D';
            } else if (A[i] - B[i] == 1 || A[i] - B[i] == -2) {
                ans[i] = 'A';
            } else {
                ans[i] = 'B';
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        for (char c : solution(N, A, B)) {
            System.out.println(c);
        }
    }

}
