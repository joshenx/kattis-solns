import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int min = x < y ? x < z ? x
                                : z
                        : y < z ? y
                                : z;
        int max = x > y ? x > z ? x
                                : z
                        : y > z ? y
                                : z;
        int med = (min == x && max == y) || (min == y) && (max == x) ? z
                        : (min == y && max == z) || (min == z && max == y) ? x
                        : y;
        String temp = sc.next();
        for (int i = 0; i < 3; i++) {
            char s = temp.charAt(i);
            switch (s) {
                case 'A':
                    ans += Integer.toString(min);
                    break;
                case 'B':
                    ans += Integer.toString(med);
                    break;
                case 'C':
                    ans += Integer.toString(max);
                    break;
            }
            if (i <= 2) {
                ans += " ";
            } else {}
        }
        System.out.println(ans);
    }
}
