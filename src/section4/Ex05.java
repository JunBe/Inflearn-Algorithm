package section4;

import java.util.*;
//K번째 큰 수
public class Ex05 {
    public static int solution(int N, int K, int[] arr) {
        int sum;
        HashMap<Integer, Integer> map = new HashMap<>();
        //nC3 조합의 합들 map에 저장
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        Map<Integer, Integer> sortedMap = new TreeMap<>(map);//treeMap을 이용하여 오름차순 정렬
        int ans = -1;

        int cnt = 0;
        for (Integer key : sortedMap.keySet()) { //키 루프시키며 K번째로 큰 수 찾기
            if (cnt == sortedMap.size() - K) {
                ans = key;
            }
            cnt++;
        }
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

        System.out.println(solution(N,K,arr));
    }
}
