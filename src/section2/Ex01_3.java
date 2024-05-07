package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01_3 {
    public static ArrayList<Integer> solution(int n, int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        for (int num : solution(N,nums)) {
            System.out.print(num + " ");

        }
    }
}
