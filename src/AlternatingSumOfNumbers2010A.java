import java.util.Scanner;

public class AlternatingSumOfNumbers2010A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();;

        while (t > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0)
                    sum += arr[i];
                else
                    sum -= arr[i];
            }
            System.out.println(sum);
            t--;
        }

    }
}
