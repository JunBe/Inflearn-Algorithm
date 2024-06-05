package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//씨름 선수

class Player implements Comparable<Player> {
    int height;
    int weight;

    Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(o.height, this.height);
    }
}
public class Ex01 {
    public static int solution(int N, ArrayList<Player> player) {
        int ans = 0;
        Collections.sort(player);

        int max = player.get(0).weight;
        ans++; //첫 번째 선수는 무조건 선출이다
        for (int i = 0; i < N; i++) { //i : 기준 선수 , j : 비교 대상들
            for (int j = i; j >= 0; j--) {
                if (max < player.get(i).weight) { // 자기보다 키가 큰 선수보다 몸무게가 높아야 탈락이 아님.
                    max = player.get(i).weight;
                    ans++;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //지원자 수
        ArrayList<Player> player = new ArrayList<>(); // 키, 몸무게
        for (int i = 0; i < N; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            player.add(new Player(height, weight));
        }

        System.out.println(solution(N, player));
    }
}
