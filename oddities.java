import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; 
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x;
            x = sc.nextInt();
            String num = Integer.toString(x);
            String state = x % 2 == 0 ? "even" : "odd";
            System.out.println(num + " is " + state);
        }
    }
}
