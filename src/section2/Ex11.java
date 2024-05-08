package section2;

import java.util.Scanner;

//임시반장 정하기
public class Ex11 {
    public static int solution(int N, int[][] studentsClass) {
        int ans = 0;
        int max = Integer.MIN_VALUE; //최소값으로 초기화

        int[] cnt = new int[N]; //같은 반이었던 학생 수

        for (int i = 0; i < N; i++) { //1번 학생부터 N번 학생까지 비교
            for (int j = 0; j < N; j++) { //학생 번호
                if (i == j) { //ex) 1번 학생과 1번 학생은 비교할 필요 x
                    continue;
                }

                for (int k = 0; k < 5; k++) {
                    if (studentsClass[i][k]==studentsClass[j][k]) { //같은 반이라면 카운트
                        cnt[i]++;
                        break; //중복 학생이 나와도 중복 카운트 하지 않도록 break
                    }
                }
            }

        }

        for (int i = 0; i < N; i++) {
            if (max < cnt[i]) { //만약 학생 수가 같을 시 작은 번호 학생 출력
                max = cnt[i];
                ans = i + 1; //같은 반이었던 학생 수가 제일 많은 학생 번호 저장
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] studentsClass = new int[N][5]; //N명 5반까지
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                studentsClass[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N, studentsClass));
    }
}
