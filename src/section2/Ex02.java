package section2;

import java.util.Scanner;

public class Ex02 {
    public static int solution(int[] height) {
        int ans = 1; //첫 번째 학생은 당연히 보이므로 1부터 시작함
        int max = height[0];
        for (int i = 1; i < height.length; i++) {
            if (max < height[i]) {
                max = height[i];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] height = new int[N];
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println(solution(height));

    }
}
