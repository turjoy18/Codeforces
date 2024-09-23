import java.util.Scanner;

public class RobinHoodAndTheMajorOak2014B {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            long fromN = (long) n *  (n  + 1) / 2;
            long fromNMinusK = (long) (n - k) * (n - k  + 1) / 2;

            long numLeaves = (long) fromN - fromNMinusK;

            if ((long) numLeaves % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        in.close();

    }
}
