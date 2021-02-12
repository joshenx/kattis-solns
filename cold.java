import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; 
        int count = 0;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x;
            x = sc.nextInt();
            count = x < 0 ? count + 1 : count;
        }
        System.out.println(count);
    }
}
