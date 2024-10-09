import java.util.Scanner;

public class osumania2009B {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            in.nextLine();
            int[] col = new int[n];
            for (int j = 0; j < n; j++) {
                String row = in.nextLine();
                col[j] = row.indexOf('#') + 1;
            }
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(col[j] + " ");
            }
            System.out.println();
        }

    }
}
