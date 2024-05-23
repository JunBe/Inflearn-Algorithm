package section5;

import java.util.Scanner;
import java.util.Stack;

//크레인 인형뽑기 다른 풀이
public class Ex03_2 {
    public static int solution(int N, int M, int[][] board, int[] moves) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (Integer x : moves) {
            for (int i = 0; i < N; i++) {
                if (board[i][x - 1] != 0) {
                    if (!stack.isEmpty()) { //스택에 하나라도 있을 경우
                        if (stack.peek() == board[i][x - 1]) { //스택의 맨 마지막 원소와 현재의 원소가 같다면 터트리기
                            stack.pop();
                            ans += 2;
                        } else { //다르면 그냥 스택에 추가
                            stack.push(board[i][x - 1]);
                        }
                    } else { //스택이 비어있을 경우
                        stack.push(board[i][x - 1]);
                    }

                    board[i][x - 1] = 0; //스택으로 옮겼으면 옮긴 원소의 보드 자리 0으로 만들어주기
                    break;
                }
            }
        }
        /*
stack : 4 3 1 1 3 2 X 4 -> 424
moves : 1 5 3 5 1 2 1 4
 */

        return ans;
    }
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