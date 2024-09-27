import java.util.Scanner;

public class ThreeBrothers2010B {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a + b == 3) {
            System.out.println(3);
        } else if (a + b == 4) {
            System.out.println(2);
        } else if (a + b == 5) {
            System.out.println(1);
        }

    }
}
