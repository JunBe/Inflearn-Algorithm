package section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//공통원소 구하기
public class Ex02_2 {
    public static ArrayList<Integer> solution(int N, int M, int[] A, int[] B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int pA = 0, pB = 0; //A와 B 인덱스 값으로 사용할 변수
        //A, B 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        while (pA < N && pB < M) { //A,B 중 하나가 인덱스 끝을 볼 때 까지 반복
            if (A[pA] < B[pB]) { //A값이 작다면 인덱스 카운트
                pA++;
            } else if (A[pA] > B[pB]) { //B값이 작다면 인덱스 카운트
                pB++;
            } else { //A,B 원소가 같다면 ans에 추가후 A,B 모두 카운트
                ans.add(A[pA]);
                pA++;
                pB++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        for (int s : solution(N, M, A, B)) {
            System.out.print(s + " ");
        }
    }
}
