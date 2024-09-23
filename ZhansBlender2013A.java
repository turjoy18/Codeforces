import java.util.Scanner;

public class ZhansBlender2013A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();

            if (n == 0) {
                System.out.println(0);
                continue;
            }

            long blending = Math.min(x, y);
            long time = (n + blending - 1) / blending;
            System.out.println(time);
        }

        in.close();

    }
}
