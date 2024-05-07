package section2;

import java.util.Scanner;
//시간초과걸림
public class Ex05 {
    public static int solution(int N) {
        int ans = 0;
        for (int i = 2; i <= N; i++) { //1은 소수가 아님
            for (int j = 2; j <= i; j++) { //1과 자신 이외에 나눠지는 수가 없어야 소수
                if (i % j == 0) {//if 4 ) 4,2 4,3 4,4 / 4,4만 맞아야함 근데 4,2도 나눠짐
                    if (i / j != 1) {
                        break;
                    }
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));
    }
}
