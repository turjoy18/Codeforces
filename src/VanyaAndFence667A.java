import java.util.Scanner;

public class VanyaAndFence667A {
    public static void main(String[] args) {
        int w = 0;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x > h)
                w += 2;
            else
                w += 1;
        }

        System.out.println(w);
    }
}
