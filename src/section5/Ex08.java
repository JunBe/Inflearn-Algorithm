package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 응급실
class Person{
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Ex08 {
    public static int solution(int N, int M, int[] dangers) {
        int ans = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(new Person(i, dangers[i])); // 번호, 위험도로 객체 생성해서 큐에 삽입
        }

        while (!queue.isEmpty()) { //queue가 모두 빌 때까지 반복
            Person tmp = queue.poll(); //빼려고 하는 원소를 tmp로 선언
            int max = tmp.priority;
            for (Person x : queue) {
                if (max < x.priority) { //tmp 보다 큰 원소가 있는지 확인
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp != null) {
                ans++; // 대기목록 환자 한 명 빠질 때 마다 1씩 ans에 카운트
                if (tmp.id == M) { //id=M 이 되는 조건을 만족해야 결과 리턴
                    return ans;
                }
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] dangers = new int[N];
        for (int i = 0; i < N; i++) {
            dangers[i] = sc.nextInt();
        }

        System.out.println(solution(N,M,dangers));
    }
}
