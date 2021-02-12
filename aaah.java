import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        String ans = x.length() >= y.length() ? "go" : "no";
        System.out.println(ans);
    }
}
