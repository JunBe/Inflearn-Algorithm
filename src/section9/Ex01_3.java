package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//씨름 선수
//
//class Player implements Comparable<Player> {
//    int height;
//    int weight;
//
//    Player(int height, int weight) {
//        this.height = height;
//        this.weight = weight;
//    }
//
//    @Override
//    public int compareTo(Player o) {
//        return Integer.compare(o.height, this.height);
//    }
//}
public class Ex01_3 {
    public static int solution(int N, ArrayList<Player> player) {
        int ans = 0;
        Collections.sort(player); // 키 순 내림차순 정렬

        int max = Integer.MIN_VALUE;
        for (Player x : player) {
            if (max < x.weight) { // 키가 작더라도 몸무게가 높으면 선수로 선발 가능
                ans++;
                max = x.weight;
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
