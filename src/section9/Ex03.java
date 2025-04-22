package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int time;
    String type;

    public Time(int time, String type){
        this.time = time;
        this.type = type;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time != o.time) {
            return Integer.compare(this.time, o.time);
        } else {
            return this.type.compareTo(o.type);
        }
    }
}

public class Ex03 {
    public static int solution(List<Time> list) {
        int ans = 0;

        Collections.sort(list);

        int count = 0;
        for (Time time : list) {
            if (time.type.equals("S")) {
                count++; //2
            } else {
                ans = Math.max(ans, count); //2
                count--;
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Time> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(new Time(sc.nextInt(), "S"));
            list.add(new Time(sc.nextInt(), "E"));
        }


        System.out.println(solution(list));

    }
}
