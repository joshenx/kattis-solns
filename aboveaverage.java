import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sets = sc.nextInt();
        for (int i = 0; i < sets; i++) {
            int persons = sc.nextInt();
            int[] grades = new int[persons];
            int sum = 0;
            // calculate average
            for (int j = 0; j < persons; j++) {
                int each = sc.nextInt();
                sum += each;
                grades[j] = each;
            }
            float average = sum / persons;
            float aboveAvg = 0;
            for (int grade : grades) {
                aboveAvg = grade > average ? aboveAvg + 1 : aboveAvg;
            }
            System.out.println(String.format("%.3f%%", (aboveAvg / persons) * 100));
        }
    }
}
