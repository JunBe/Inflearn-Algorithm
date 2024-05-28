package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//공주 구하기 (큐 사용)
public class Ex06_2 {
    public static int solution(int N, int K) {
        int ans;
        int cnt = 1;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            if (cnt == K) { //K를 외치면
                queue.poll(); // 그 왕자를 제외시키기만 한다.
                cnt = 1;
            } else {
                queue.offer(queue.poll()); // 왕자를 제외시킨 후 다시 맨 뒤로 넣는다.
                cnt++;
            }
        }
        ans = queue.peek();
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(solution(N, K));
    }
}
