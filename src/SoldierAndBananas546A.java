import java.util.Scanner;

public class SoldierAndBananas546A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();

        int totalCost =  0;
        for (int i = 1; i <= w; i++) {
            totalCost += i * k;
        }

        System.out.println(Math.max(totalCost - n, 0));

    }
}
