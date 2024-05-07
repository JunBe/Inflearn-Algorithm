package section2;

import java.util.Scanner;

public class Ex04 {
    public static int[] solution(int N) {
        int[] ans = new int[N];
        for (int i = 0; i < ans.length; i++) {
            if (i == 0 || i == 1) {
                ans[i] = 1;
            } else {
                ans[i] = ans[i - 1] + ans[i - 2];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int n : solution(N)) {
            System.out.print(n + " ");
        }
    }
}
