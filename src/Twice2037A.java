import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Twice2037A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            System.out.println(maximumScore(a));
        }
        in.close();
    }

    private static int maximumScore(int[] a) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : a)
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        int score = 0;

        for (int count : countMap.values()) {
            if (count > 1)
                score += count / 2;
        }
        return score;
    }
}
