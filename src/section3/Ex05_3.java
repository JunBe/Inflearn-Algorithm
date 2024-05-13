package section3;

import java.util.Scanner;
//연속된 자연수의 합 (수학)

public class Ex05_3 {

    //2개의 숫자로 15를 만드는 경우의 수
    //먼저 1부터 차례로 두개를 뽑고 15에서 합을 뺀다 -> 15-(1+2) =12
    //이 값이 뽑은 숫자의 개수(2개)로 나눴을 때 나머지가 0이라면 정답 -> 12%2=0
    //왜 그렇게 되냐면 1과 2에 12/2값인 6을 하나씩 할당해주면 7과 8이 되어서 두 수의 합이 15가 된다.
    public static int solution(int N) { //if 15
        int ans = 0;
        N--; //1 뽑고 N에서 빼주기
        int cnt = 1; //연속된 자연수 개수 (현재 1)
        while (N > 0) {
            cnt++; //그 다음 수를 뽑고 (뽑은 개수와 수의 값은 일치)
            N -= cnt; //그 수를 N에서 빼준다
            if (N % cnt == 0) { //만약 N에서 cnt를 나눴을 때 나머지가 0이라면 (1~cnt 까지 모두 같은 값을 할당해줄 수 있다면) 
                ans++;//정답이므로 ans 카운트
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solution(N));

    }
}
