import java.util.Scanner;

public class BitPlusPlus282A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int i = 0;
        int x = 0;
        while (i < n) {
            String v = in.nextLine();

            if (v.equals("++X") || v.equals("X++")) {
                x++;
            } else if (v.equals("--X") || v.equals("X--")) {
                x--;
            }

            i++;
        }

        System.out.println(x);

    }
}
