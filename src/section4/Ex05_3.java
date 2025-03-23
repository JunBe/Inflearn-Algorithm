package section4;

import java.util.*;

public class Ex05_3 {
    public static int solution(int N, int K, Integer[] arr) {
        int sum = 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    set.add(sum);
                }
            }
        }

        List<Integer> sumList = new ArrayList<>(set);
        sumList.sort(Collections.reverseOrder());

        if (K > sumList.size()) {
            return -1;
        }

        return sumList.get(K-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, K, arr));
    }
}
