package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06_2 {

    public static boolean isPrime(int res) {
        for (int i = 2; i < res; i++) {
            if (res % i == 0) {
                return false;
            }
        }
        if (res == 1) {
            return false;
        }
        return true;
    }


    public static ArrayList<Integer> solution(int N,int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int tmp = nums[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) {
                ans.add(res);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        for (Integer i : solution(N, nums)) {
            System.out.print(i + " ");
        }

    }
}
