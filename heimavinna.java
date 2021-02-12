import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(";");
        int sum = 0;
        for (String range : arr) {
            String[] defRange = range.split("-");
            if (defRange.length > 1) {
                int x = Integer.parseInt(defRange[0]);
                int y = Integer.parseInt(defRange[1]);
                sum += (y - x + 1);
            } else {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
