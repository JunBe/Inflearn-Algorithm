package section5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex03_3 {

    public static int solution(int N, int M, int[][] board, int[] moves) {
        Deque<Integer> stack = new ArrayDeque<>();

        int count = 0;

        for (int move : moves) {
            for (int i = 1; i <= N; i++) {
                int val = board[i][move];
                if (val != 0) {
                    if (!stack.isEmpty() && val == stack.peek()) {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.push(val);
                    }
                    board[i][move] = 0;
                    break;
                }
            }

        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int M = sc.nextInt();
        int[] moves = new int[M];
        for (int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, board, moves));

    }
}
