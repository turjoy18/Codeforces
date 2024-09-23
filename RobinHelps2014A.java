import java.util.Scanner;

public class RobinHelps2014A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        for (int i = 0; i < t; i++) {

            int n = in.nextInt();
            int k = in.nextInt();

            int[] arr = new int[n];
            for (int l = 0; l < n; l++) {
                arr[l] = in.nextInt();
            }

            int robinGold = 0;
            int counter = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] >= k) {
                    robinGold += arr[j];
                } else if (arr[j] == 0 && robinGold > 0) {
                    robinGold--;
                    counter++;
                }
            }
            System.out.println(counter);
        }

        in.close();

    }
}
