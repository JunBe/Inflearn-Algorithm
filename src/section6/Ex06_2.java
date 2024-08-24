package section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//장난꾸러기 다른 풀이
public class Ex06_2 {
    public static List<Integer> solution(int N, int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < N; i++) {
            if (arr[i] != tmp[i]) {
                ans.add(i + 1);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (Integer val : solution(N, arr)) {
            System.out.print(val + " ");
        }
    }
}
