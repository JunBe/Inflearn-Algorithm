package other;

import java.util.Scanner;
//backtracking - 0-1 Knapsack Problem
public class Assignment {
    //전역 변수
    public static int maxProfit = 0; //최대 이익
    public static int numBest; // 최고 promising의 level 저장
    public static String[] bestSet;
    public static String[] include; // "yes" -> 무게,이익 추가 o 왼쪽 트리로 이동 / "no" -> 무게,이익 추가 x 오른쪽 트리로 이동

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
        bestSet = new String[N];
        include = new String[N];

        for (int i = 0; i < N; i++) {
            bestSet[i] = "no";
            include[i] = "no";
        }

        knapsack(0, 0, 0, maxWeight, profits, weights);

        System.out.print("Optimal solution : ");
        for (String s : bestSet) {
            if (s.equals("yes")) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
        System.out.println();
        System.out.print("Maximum profit : " + maxProfit);
        //output : optimal solution, Maximum profit
    }

    public static void knapsack(int i, int profit, int weight,int W,int[] profits,int[] weights) {
        if (weight <= W && profit > maxProfit) {
            maxProfit = profit;
            numBest = i;
            bestSet = include.clone();
        }

        if (promising(i, profit,weight, W, profits, weights)) {
            if (i < profits.length) {
                include[i] = "yes";
                knapsack(i + 1, profit + profits[i], weight + weights[i], W, profits, weights);
                include[i] = "no";
                knapsack(i + 1, profit, weight, W, profits, weights);
            }
        }
    }

    public static boolean promising(int i,int profit, int weight,int W,int[] p,int[] w) {
        int j, k;
        int totWeight; // 현재까지의 무게
        float bound;
        int n = w.length;
        if (weight >= W) {
            return false;
        } else {
            j = i;
            bound = profit;
            totWeight = weight;

            while (j < n && totWeight + w[j] <= W) {
                totWeight += w[j];
                bound += p[j];
                j++;
            }
            k = j;
            if (k < n) {
                bound += (W - totWeight) * p[k] / (float) w[k];
            }
            return bound > maxProfit;
        }
    }
}