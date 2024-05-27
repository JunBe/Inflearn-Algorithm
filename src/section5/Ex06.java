package section5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
//공주 구하기
public class Ex06 {
    public static int solution(int N, int K) {
        int ans = 0;
        int cnt = 1;
        Stack<Integer> stack = new Stack<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr = new int[N];
        for (int i = 1; i <= N; i++) { // 1 ~ N 왕자 stack에 넣기
            arrayList.add(i);
        }

        while (arrayList.size() != 1) {
            if (cnt == K) { // 제외될 왕자
                arrayList.remove(ans);
                ans--;
                cnt = 1;
            } else {
                cnt++;
            }
            if (ans == arrayList.size() - 1) { //왕자의 번호
                ans = 0;
            } else {
                ans++;
            }

        }
        ans = arrayList.get(0);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(solution(N, K));
    }
}
