package section2;

import java.util.Scanner;

public class Ex07 {

    public static int solution(int[] arr) {
        int ans=0;
        int count = 0;
        int[] point = new int[arr.length];

        //점수 배열에 점수를 넣는 알고리즘
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) { // 정답일 때
                count++;
                point[i] = count;
            } else { // 오답일 때
                count = 0;
            }
        }

        //점수배열의 점수의 모든 합을 구하기
        for (int i = 0; i < point.length; i++) {
            ans += point[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //처음 문제 맞으면 1점. 1문제씩 더 맞출수록 1점씩 올라감 ex) 2연속 맞춤 1,2점 3연속 맞춤 1,2,3점 틀리면 초기화/ 다시 1점부터 시작
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));

    }
}
