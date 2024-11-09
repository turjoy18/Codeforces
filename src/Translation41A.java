import java.util.Scanner;

public class Translation41A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();

        String tReverse = "";
        for (int i = t.length() - 1; i >= 0; i--) {
            tReverse += t.charAt(i);
        }

        if (s.equals(tReverse))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
