import java.util.Scanner;

public class WrongSubtraction977A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        while (k-- > 0) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n -= 1;
            }
        }

        System.out.println(n);

    }
}
