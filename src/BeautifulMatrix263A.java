import java.util.Scanner;

public class BeautifulMatrix263A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int row = 0;
        int column = 0;

        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j= 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
                if (arr[i][j] == 1) {
                    row = i;
                    column = j;
                }
            }
        }

        int output = Math.abs(row - 2) + Math.abs(column - 2);


        System.out.println(output);

    }
}
