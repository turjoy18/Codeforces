import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int output = 0;
        for (int i = 0; i < n; i++) {
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = in.nextInt();
            }
            int counter = 0;
            for (int k = 0; k < 3; k++) {
                if (arr[k] == 1) {
                    counter++;
                }
            }
            if (counter >= 2) {
                output++;
            }
        }
        System.out.println(output);

    }
}
