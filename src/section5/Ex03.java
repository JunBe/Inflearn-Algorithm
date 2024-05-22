package section5;

import java.util.Scanner;
import java.util.Stack;

//크레인 인형뽑기
public class Ex03 {
    public static int solution(int N, int M, int[][] board, int[] moves) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < M; i++) { //moves 횟수(작동 횟수) 만큼 반복
            //맨 위에 있는 인형 스택에 넣는 루프
            for (int j = 0; j < N; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    stack.push(board[j][moves[i] - 1]);
                    if (stack.size() >= 2) { //스택 사이즈가 2개 이상이어야지만 2개 비교가 가능하다.
                        //새로 들어온 원소가 전 원소와 같다면 2개 카운트 후 두 원소 스택에서 빼기
                        if (stack.get(stack.size() - 1).equals(stack.get(stack.size() - 2))) {
                            ans += 2;
                            stack.pop();
                            stack.pop();
                        }

                    }
                    board[j][moves[i] - 1] = 0; // 스택에 들어간 원소는 보드에서 빼주기
                    break;
                }
            }

        }

        return ans;
    }
/*
0 0 0 0 0
0 0 0 0 0
0 0 5 0 0
0 2 4 0 2
0 5 1 3 1

stack : 4 3 1 1 3 2 X 4 -> 424
moves : 1 5 3 5 1 2 1 4
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N]; //격자판 배열
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int M = sc.nextInt(); //1~1000 / 작동횟수
        int[] moves = new int[M]; // 원소의 값은 1~N / 크레인 작동 위치
        for (int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(N, M, board, moves));
    }
}

//4311324 -> 11 ,33 2세트 터짐