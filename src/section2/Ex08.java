package section2;

import java.util.Scanner;

public class Ex08 {

    public static int[] solution(int N, int[] grades) {
        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N; j++) {
                if (grades[i] < grades[j]) {
                    cnt++;
                }
            }
            ans[i] = cnt;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] grades = new int[N];
        for (int i = 0; i < N; i++) {
            grades[i] = sc.nextInt();
        }
        for (int s : solution(N, grades)) {
            System.out.print(s + " ");
        }
    }
}
