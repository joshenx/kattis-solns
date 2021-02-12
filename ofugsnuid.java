import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            stack.push(x);
        }
        for (int j = 0; j < n; j++) {
            System.out.println(stack.pop());
        }
        
    }
}
