import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sets = sc.nextInt();
        do {
            if (sets == -1) {
                
            }
            int count = 0;
            int prev = 0;
            String miles;
            for (int i = 0; i < sets; i++) {
                int speed = sc.nextInt();
                int totalDist = sc.nextInt();
                int distTravelled = totalDist - prev;
                count += speed * distTravelled;
                prev = totalDist;
            }
            miles = Integer.toString(count);
            System.out.println(miles + " miles");
            sets = sc.nextInt();
        } while (sets >= 0);
    }
}
