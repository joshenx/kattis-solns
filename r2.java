import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = str.split(" ");
        int x = Integer.parseInt(nums[0]);
        int y = Integer.parseInt(nums[1]);
        int diff = y - x;
        System.out.println(y + diff);
    }
}
