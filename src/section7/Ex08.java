package section7;

import java.util.Scanner;

//송아지 찾기
public class Ex08 {
    public static int solution(int S, int E) {
        int ans = 0;
        int dis = E - S;

        if (dis < 0) {
            return -dis;
        }

        ans += dis / 5;
        if (dis % 5 <= 3) {
            ans += dis % 5;
        } else {
            ans += 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // 현수의 위치
        int E = sc.nextInt(); // 송아지의 위치

        System.out.println(solution(S, E));

    }
}
