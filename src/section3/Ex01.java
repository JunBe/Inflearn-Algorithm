package section3;

import java.util.Scanner;

public class Ex01 {//런타임 오류

    public static int[] solution(int N, int M, int[] arr1, int[] arr2) {
        int[] ans = new int[N + M];
        int x = 0; //N배열 조작 변수
        int y = 0; //M배열 조작 변수

        for (int i = 0; i < N + M; i++) {
            if (arr1[x] < arr2[y]) { //arr1 배열의 원소가 arr2 배열의 원소보다 작을 때
                ans[i] = arr1[x++]; //ans배열에 넣어주고 x 카운트
                if (x == N) { // arr1을 끝까지 읽었다는 뜻이므로 남은 arr2 원소 ans에 다 대입
                    for (int j = i+1; j < N + M; j++) {
                        ans[j] = arr2[y++];
                    }
                    break; //break 안 해주면 i for문이 계속 돈다.
                }
            } else {
                ans[i] = arr2[y++]; //ans배열에 넣어주고 y 카운트
                if (y == M) { // arr2을 끝까지 읽었다는 뜻이므로 남은 arr1 원소 ans에 다 대입
                    for (int j = i+1; j < N + M; j++) {
                        ans[j] = arr2[x++];
                    }
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int s : solution(N, M, arr1, arr2)) {
            System.out.print(s+" ");
        }

    }
}
