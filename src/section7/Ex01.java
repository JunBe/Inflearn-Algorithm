package section7;

public class Ex01 {
    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        DFS(3);
    }
}
