package section8;

import java.util.Scanner;

public class Ex07 {
    private static void solution() {
        //5 3 -> 10
        //5C3 = 4C2 + 4C3 = 6 + 4 = 10
        //4C2 = 3C1 + 3C2 = 3 + 3 = 6  / 4C3 = 3C2 + 3C3 = 3 + 1 = 4
        //3C1 = 2C0 + 2C1 = 1 + 2 = 3 / 3C2 = 2C1 + 2C2 = 2 + 1 = 3 /  3C3 = 1
        //2C1 = 1C0 + 1C1 = 1 + 1 = 2
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        solution();
    }
}
