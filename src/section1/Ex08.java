package section1;

import java.util.Scanner;

public class Ex08{

    public static String solution(String str) {
        String answer = "YES";
        //1. 단어별로 쪼개기
        String[] words = str.split("\\s+");
        String[] wordsArr = new String[words.length];


        //2. 만약 단어의 개수가 6개라면 포문으로 1~3까지 돌려서 1-6 2-5 3-4 와 같은 식으로 비교하기
        //2에서 비교할 때 알파벳 이외의 문자는 다 무시할 것 ex)숫자, 특수문자
        for (int i = 0; i < words.length / 2; i++) {

            //알파벳만 뽑아서 wordsArr에 저장
            for (int j = 0; j < words[i].length(); j++) { //words[i].length()는 단어 길이
                if ('A' <= words[i].charAt(j) && words[i].charAt(j) <= 'z') {
                    wordsArr[i] += words[i].charAt(j);
                }
            }

            for (int j = words[words.length - i - 1].length() - 1; j >= 0; j--) { //5 ~ 0

                if ('A' <= words[words.length - i - 1].charAt(j) && words[words.length - i - 1].charAt(j) <= 'z') {
                    wordsArr[wordsArr.length - i - 1] += words[words.length - i - 1].charAt(j);
                }
            }


            //대소문자 구분 없이 비교
            if (!wordsArr[i].equalsIgnoreCase(wordsArr[words.length - i - 1])) {
                answer = "NO";
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //문자열 입력
        System.out.println(solution(str));
    }
}
