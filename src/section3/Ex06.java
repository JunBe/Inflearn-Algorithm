package section3;

import java.util.Scanner;

public class Ex06 {
    public static int solution(int N, int k, int[] arr) {
        int ans = 0;
        int cnt = 0, lt = 0; //cnt는 0의 개수
        for (int rt = 0; rt < N; rt++) {
            if (arr[rt] == 0) { //만약 arr의 인덱스rt의 값이 0이라면 cnt 카운트 
                cnt++;
            }
            //0이 최대 k개 사용 가능하므로 k개를 초과하면 0 하나를 뺴줘야한다.
            while (cnt > k) {
                //이때 lt를 한칸씩 올리며 0을 찾고, 0을 찾았을 시 cnt를 감소시킨다.
                if (arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            ans = Math.max(ans, rt - lt + 1); // 기존 길이의 최댓값과 현재 길이의 최댓값과 비교하여 더 큰 값 대입
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, k, arr));
    }
}
