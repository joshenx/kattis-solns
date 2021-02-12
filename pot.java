import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x;
            int k;
            int r;
            x = sc.nextInt();
            k = x / 10;
            r = x % 10;
            sum += Math.pow(k, r);
        }
        System.out.println(sum);
    }
}
