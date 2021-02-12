import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = n % 2 == 1 ? "Alice" : "Bob";
        System.out.println(ans);
    }
}
