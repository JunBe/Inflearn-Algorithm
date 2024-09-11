package section8;

import java.util.Scanner;

//합이 같은 부분집합
public class Ex01 {
    static int[] arr;
    static int arrSum = 0;
    static String ans = "NO";
    public static String DFS(int idx,int sum) {
        if (idx == 0) {
            if (arrSum % 2 == 1) {
                return ans = "NO";
            } else {
                arrSum /= 2;
            }
        }
        int len = arr.length;

        if (idx == len) {
            return "";
        } else {
            DFS(idx + 1, sum);
            sum += arr[idx];
            if (sum == arrSum) {
                ans= "YES";
            }
            DFS(idx + 1, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arrSum += arr[i];
        }
        System.out.println(DFS(0, 0));

    }
}
