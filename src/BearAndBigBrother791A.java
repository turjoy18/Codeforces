import java.util.Scanner;

public class BearAndBigBrother791A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int yearsNeeded = 0;

        while (a <= b) {
            a *= 3;
            b *= 2;
            yearsNeeded++;
        }

        System.out.println(yearsNeeded);

    }
}
