package section2;

import java.util.Scanner;

//봉우리 다른 풀이
public class Ex10_2 {
    public static int solution(int N, int[][] arr) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean flag = true; //봉우리 참,거짓 여부 판별
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    //자신이 크지 않다면 false 대입 후 break;
                    if (ny >= 0 && nx >= 0 && ny < N && nx < N && arr[i][j] <= arr[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) { //true라면 봉우리 이므로 ans 카운트
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N,arr));
    }
}
