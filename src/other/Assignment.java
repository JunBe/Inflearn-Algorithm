package other;

import java.util.Scanner;
//backtracking - 0-1 Knapsack Problem
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // item 개수
        int maxWeight = sc.nextInt(); // 최대 무게
        int[] weights = new int[N]; // 아이템 별 무게
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
        }
        int[] profits = new int[N]; // 아이템 별 이익
        for (int i = 0; i < N; i++) {
            profits[i] = sc.nextInt();
        }

        //output : optimal solution, Maximum profit
    }
}
