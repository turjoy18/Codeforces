import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KousukesAssignment2033D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.println(beautiful(a));
        }

    }

    public static int beautiful(int[] a) {
        Map<Integer, Integer> prefixSumIndex = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        int lastEnd = -1;

        prefixSumIndex.put(0, -1);

        for (int i = 0; i < a.length; i++) {
            prefixSum += a[i];

            if (prefixSumIndex.containsKey(prefixSum)) {
                int prevIndex = prefixSumIndex.get(prefixSum);
                if (prevIndex >= lastEnd) {
                    count++;
                    lastEnd = i;
                }
            }
            prefixSumIndex.put(prefixSum, i);
        }
        return count;
    }

}
