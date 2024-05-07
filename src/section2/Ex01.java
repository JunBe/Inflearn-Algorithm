package section2;

import java.util.Scanner;

public class Ex01 {
    public static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                cnt++;
                ans[cnt] = nums[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
//        for (int num : nums) { 향상된 for문은 읽기만 가능하고 수정불가
//            num = sc.nextInt();
//        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int num : solution(nums)) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
