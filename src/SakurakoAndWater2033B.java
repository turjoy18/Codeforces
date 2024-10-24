import java.util.Scanner;

public class SakurakoAndWater2033B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int caseNum = 0; caseNum < t; caseNum++) {
            int n = in.nextInt();
            int[][] heights = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    heights[i][j] = in.nextInt();
                }
            }

            int ops = 0;

            // Process diagonals starting from the last row
            for (int start = n - 1; start >= 0; start--) {
                int x = start;
                int y = 0;
                while (x < n && y < n) {
                    if (heights[x][y] < 0) {
                        int increase = -heights[x][y];
                        ops += increase;
                        for (int k = 0; k < Math.min(n - x, n - y); k++) {
                            heights[x + k][y + k] += increase;
                        }
                    }
                    x++;
                    y++;
                }
            }

            // Process diagonals starting from the last column (excluding the last element)
            for (int start = 1; start < n; start++) {
                int x = 0;
                int y = start;
                while (x < n && y < n) {
                    if (heights[x][y] < 0) {
                        int increase = -heights[x][y];
                        ops += increase;
                        for (int k = 0; k < Math.min(n - x, n - y); k++) {
                            heights[x + k][y + k] += increase;
                        }
                    }
                    x++;
                    y++;
                }
            }

            System.out.println(ops);
        }

    }
}