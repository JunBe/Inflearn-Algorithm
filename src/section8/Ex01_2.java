package section8;

import java.util.Scanner;

//합이 같은 부분집합
public class Ex01_2 {
    static int[] arr;
    static int total = 0;
    static String ans = "NO";
    static boolean flag = false;

    public static void DFS(int idx,int sum) {
        int len = arr.length;
        if (flag) {
            return;
        }
        if (idx == len) {
            if (total - sum == sum) {
                ans = "YES";
                flag = true;
            }
        } else {
            DFS(idx + 1, sum);
            DFS(idx + 1, sum + arr[idx]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0, 0);
        System.out.println(ans);

    }
}
