package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
    public static ArrayList<Integer> solution(int N,String[] nums) {
        int[] solNum=new int[N];
        String str;
        int max = -1;
        ArrayList<Integer> ans = new ArrayList<>();
        
        //입력받은 정수들을 뒤집어서 int형 변수로 solNum에 저장 및 최대값 찾기
        for (int i = 0; i < N; i++) {
            str = new StringBuilder(nums[i]).reverse().toString();
            solNum[i] = Integer.parseInt(str);
            if (solNum[i] > max) {
                max = solNum[i];
            }
        }

        //최대값으로 배열 만들어서 소수 배열 만들기 / 소수 -> 1 , 소수X -> 0 
        int arr[] = new int[max + 1];
        arr[1] = 1;
        for (int i = 2; i <= max; i++) {
            if (arr[i] == 0) {
                for (int j = i; j <= max; j += i) {
                    arr[j] = 1;
                }
                arr[i] = 0;
            }
        }

        //solNum(뒤집은 수) 중 소수(arr값이 0) 인 수만 출력
        for (int i = 0; i < solNum.length; i++) {
            if (arr[solNum[i]] == 0) {
                ans.add(solNum[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] nums = new String[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.next();
        }

        for (Integer i : solution(N, nums)) {
            System.out.print(i + " ");
        }

    }
}
