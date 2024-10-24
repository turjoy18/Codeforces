import java.util.Scanner;

public class SakurakoAndKosuke2033A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            System.out.println(findWinner(n));
        }

    }

    public static String findWinner(int n) {
        int x = 0;
        int count = 1;

        while (true) {
            x -= 2 * count - 1;
            if (Math.abs(x) > n) {
                return "Sakurako";
            }
            count++;

            x += 2 * count - 1;
            if (Math.abs(x) > n) {
                return "Kosuke";
            }
            count++;
        }

    }

}
