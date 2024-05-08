package section2;

import java.util.Scanner;

//임시반장 정하기
public class Ex11 {
    public static int solution(int N, int[][] studentsClass) {
        int ans = 0;
        int max = Integer.MIN_VALUE; //최소값으로 초기화
        int[] cnt = new int[N]; //같은 반이었던 학생 수

        for (int i = 0; i < N; i++) { //1학년부터
            //1번학생부터 비교
            int[] student = new int[N];
            for (int j = 0; j < 5; j++) { //학년
                //1학년 먼저 비교
                int classNum = studentsClass[i][j]; //1번학생 학년별 반 번호
                for (int k = 0; k < N; k++) {
                    if (i == k) {
                        continue;
                    }
                    if (classNum == studentsClass[k][j]) {
                        student[j] += 1;
                    }
                }
            }

            for (int x = 0; x < N; x++) {
                if (student[x] > 0) {
                    cnt[i]++;
                }
            }

        }

        System.out.println("cnt");
        for (int i : cnt) {
            System.out.print(i+" ");
        }

        for (int i = 0; i < N; i++) {
            if (max < cnt[i]) { //만약 학생 수가 같을 시 작은 번호 학생 출력
                max = cnt[i];
                ans = i + 1; //같은 반이었던 학생 수가 제일 많은 학생 번호 저장
            }
        }

        return ans; //중복된 반 개수 제거가 안된다..
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
