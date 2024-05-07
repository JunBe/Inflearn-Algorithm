package section2;

import java.util.Scanner;

public class Ex05_2 {
    public static int solution(int N) {
        int ans = 0;
        int[] arr = new int[N + 1];

        //arr = {1,2,3,4,5,.......,N} index: 0 ~ N-1
        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                ans++;
                for (int j = i; j <= N; j+=i) {
                    arr[j] = 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));
    }
}
