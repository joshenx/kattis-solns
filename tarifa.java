import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int n;
        x = sc.nextInt();
        n = sc.nextInt();
        int count = x * (n + 1);
        for (int i = 0; i < n; i++) {
            int p;
            p = sc.nextInt();
            count -= p;
        }
        System.out.println(count);
    }
}
