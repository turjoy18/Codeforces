import java.util.Scanner;

public class Minimize2009A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(b - a);
        }

    }
}
