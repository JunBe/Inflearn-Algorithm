package section2;

import java.util.Arrays;
import java.util.Scanner;

//멘토링 다른 풀이
public class Ex12_2 {

    public static int solution(int N, int M, int[][] arr) {
        int ans = 0;
        //i,j는 두 학생 번호 조합 ex) (1,3) -> 1,3번 학생 / (멘토,멘티)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int pi=0, pj=0; //i와 j 인덱스 저장할 변수
                int cnt = 0;
                for (int x = 0; x < M; x++) { //테스트 수 루프
                    for (int y = 0; y < N; y++) { //학생 루프
                        //i(첫번째 학생)과 같다면 인덱스를 pi에 저장
                        if (arr[x][y] == i + 1) {
                            pi = y;
                        }
                        //j(두번째 학생)과 같다면 인덱스를 pj에 저장
                        if (arr[x][y] == j + 1) {
                            pj = y;
                        }
                    }
                    if (pi < pj) { //i가 j보다 등수가 높다면 (멘토 멘티 성립) 카운트
                        cnt++;
                    }
                }
                if (cnt == M) { //모든 테스트에서 멘토(i)의 등수가 높았다면 ans 카운트
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
