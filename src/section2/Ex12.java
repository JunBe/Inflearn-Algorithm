package section2;

import java.util.Arrays;
import java.util.Scanner;
//멘토링
public class Ex12 {

    public static int solution(int N, int M, int[][] arr) {
        int ans = 0;

        for (int i = 1; i < N + 1; i++) { // 학생 번호

            boolean[] flag = new boolean[N];
            Arrays.fill(flag, true);

            //1명의 학생 멘토멘티 가능한 경우 수
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[j][k] == i) {
                        flag[i - 1] = false;
                        break;
                    }
                    if (!flag[arr[j][k] - 1]) { //만약 이미 false였다면 true로 바뀌어도 오답이니 continue로 처리
                        continue;
                    }
                    flag[arr[j][k] - 1] = false; //i보다 왼쪽에 있을 시 등수가 높으므로 false
                }
            }

            //flag값이 true라면 짝을 만들 수 있는 경우이므로 ans 카운트
            for (boolean f : flag) {
                if (f) {
                    ans++;
                }
            }

        }

        return ans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //반 학생 수
        int M = sc.nextInt(); //수학 테스트 횟수
        int[][] arr = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N, M, arr));

    }
}
