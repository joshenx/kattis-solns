import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            String x = sc.next();
            String y = sc.next();
            boolean xIsLarger = false;
            if (x.length() == y.length()) {
                for (int i = 0; i < x.length(); i++) {
                    int xCom = Character.getNumericValue(x.charAt(i));
                    int yCom = Character.getNumericValue(y.charAt(i));
                    if (xCom > yCom) {
                        xIsLarger = true;
                        break;
                    } else if (yCom > xCom){
                        break;
                    }
                }
            } else {
                xIsLarger = x.length() > y.length();
            }
            // reverse
            String revX = new StringBuilder(x).reverse().toString();
            String revY = new StringBuilder(y).reverse().toString();
            if (xIsLarger) {
                String revAns = "";
                int diff = 0;
                int i = 0;
                while (i < revY.length() || diff < 0) {
                    int xCom = Character.getNumericValue(revX.charAt(i));
                    int yCom;
                    if (i < revY.length()) {
                        yCom = Character.getNumericValue(revY.charAt(i));
                    } else {
                        yCom = 0;
                    }
                    int newDigit = xCom - yCom + diff < 0 ? xCom - yCom + 10 + diff : xCom - yCom + diff;
                    diff = xCom - yCom + diff < 0 ? -1 : 0;
                    revAns += Integer.toString(newDigit);
                    i += 1;
                }
                revAns += revX.substring(i);
                revAns = new StringBuilder(revAns).reverse().toString();
                while (revAns.charAt(0) == '0') {
                    revAns = revAns.substring(1);
                }
                System.out.println(revAns);
            } else {
                String revAns = "";
                int diff = 0;
                int i = 0;
                while (i < revX.length() || diff < 0) {
                    int xCom;
                    if (i < revX.length()) {
                        xCom = Character.getNumericValue(revX.charAt(i));
                    } else {
                        xCom = 0;
                    }
                    int yCom = Character.getNumericValue(revY.charAt(i));
                    int newDigit = yCom - xCom + diff < 0 ? yCom - xCom + 10 + diff : yCom - xCom + diff;
                    diff = yCom - xCom + diff < 0 ? -1 : 0;
                    revAns += Integer.toString(newDigit);
                    i += 1;
                }
                revAns += revY.substring(i);
                revAns = new StringBuilder(revAns).reverse().toString();

                while (revAns.charAt(0) == '0' && revAns.length() > 1) {
                    revAns = revAns.substring(1);
                }
                System.out.println(revAns);
            }
        }
    }
}
