package section6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5 9
//1 2 3 2 6 2 3 5 7
public class Ex04_4 {

    public static List<Integer> solution(int S, int[] arr, int N) {
        List<Integer> ram = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            //1 3 2 4 6
            if (ram.contains(arr[i])) {
                for (int j = 0; j < ram.size(); j++) {
                    if (ram.get(j) == arr[i]) {
                        ram.remove(j);
                        ram.add(arr[i]);
                        break;
                    }
                }
            } else if (ram.size() == S) {
                ram.remove(0);
                ram.add(arr[i]);
            } else {
                ram.add(arr[i]);
            }

        }

        return ram;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> solution = solution(S, arr, N);

        for (int i = solution.size() - 1; i >= 0; i--) {
            System.out.print(solution.get(i) + " ");
        }

    }
}
