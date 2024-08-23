package section6;

import java.util.*;

// Least Recently Used
public class Ex04 {
    public static List<Integer> solution(int S, int N, int[] arr) {
        List<Integer> memory = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (!memory.contains(arr[i])) { // Cache Miss
                if (memory.size() == S) {
                    memory.remove(0);
                    memory.add(arr[i]);
                }else{
                    memory.add(arr[i]);
                }
            } else { //Cache Hit
                memory.remove(memory.indexOf(arr[i]));
                memory.add(arr[i]);
            }
        }

        return memory;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = S - 1; i >= 0; i--) {
            System.out.print(solution(S, N, arr).get(i)+" ");
        }
    }
}
