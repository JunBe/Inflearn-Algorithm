package section4;

import java.util.HashMap;
import java.util.Scanner;

//매출액의 종류
public class Ex03 {
    public static int[] solution(int N, int K, int[] arr) {
        int[] ans = new int[N - K + 1];
        int lt = 0; //left 인덱스 변수
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < K; i++) { //0~K-1 인덱스 까지 초기화
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); //
        }

        for (int rt = K; rt < N; rt++) {//lt rt 하나씩 늘리며 구간을 정해 한칸씩 오른쪽으로 옮기는 루프
            ans[lt] = map.size(); //map의 크기 = 매출액 종류의 개수
            if (map.get(arr[lt]) >= 2) { //맨 왼쪽 인덱스 값이 map에 2개 이상이라면 하나만 줄인다
                map.put(arr[lt], map.get(arr[lt]) - 1);
            } else { // 만약 1개거나 없다면 그냥 삭제
                map.remove(arr[lt]);
            }
            lt++;
            //arr배열의 인덱스 rt의 값이 있다면 거기에 +1 없다면 0에 +1
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
        }
        ans[lt] = map.size(); //마지막 ans배열 대입 안해줬으므로 여기서 해줘야 함

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int s : solution(N, K, arr)) {
            System.out.print(s + " ");
        }
    }
}
