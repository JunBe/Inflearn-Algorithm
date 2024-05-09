package section3;

import java.util.ArrayList;
import java.util.Scanner;
//공통원소 구하기 Time limit 걸림
public class Ex02 {
    public static ArrayList<Integer> solution(int N, int M, int[] A, int[] B) {
        ArrayList<Integer> tmp = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();



        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i] == B[j]) {
                    tmp.add(A[i]);
                    break;
                }
            }
        }

        while (tmp.size() != 0) {
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < tmp.size(); i++) {
                if (tmp.get(i) < min) {
                    min = tmp.get(i);
                }
            }
            ans.add(min);
            tmp.remove(tmp.indexOf(min));
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
