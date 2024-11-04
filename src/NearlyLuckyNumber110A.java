import java.util.Scanner;

public class NearlyLuckyNumber110A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        int luckyDigitCount = 0;
        for (char digit : n.toCharArray()) {
            if (digit == '4' || digit == '7') {
                luckyDigitCount++;
            }
        }

        if (luckyDigitCount == 4 || luckyDigitCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
