package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 회의실 배정
class MeetTime implements Comparable<MeetTime> {
    int startTime;
    int endTime;

    MeetTime(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(MeetTime o) {
        if (this.endTime != o.endTime) {
            return Integer.compare(this.endTime, o.endTime);
        } else {
            return Integer.compare(this.startTime, o.startTime);
        }
    }
}


public class Ex02 {

    /**
     * 2 3
     * 1 4
     * 3 5
     * 4 6
     * 5 7
     */
    public static int solution(int N, ArrayList<MeetTime> meetTimes) {
        int ans = 1;
        Collections.sort(meetTimes);
        int endTime = meetTimes.get(0).endTime;

        for (int i = 1; i < N; i++) {
            if (meetTimes.get(i).startTime >= endTime) {
                endTime = meetTimes.get(i).endTime;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<MeetTime> meetTimes = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            meetTimes.add(new MeetTime(sc.nextInt(), sc.nextInt()));
        }

        System.out.println(solution(N, meetTimes));


    }
}