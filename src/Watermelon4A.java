import java.util.Scanner;

public class Watermelon4A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        if (w % 2 == 0 && w >= 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
