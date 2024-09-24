import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths339A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int[] nums = new int[(str.length() / 2) + 1];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '+') {
                nums[count] = Character.getNumericValue(str.charAt(i));
                count++;
            }
        }

        Arrays.sort(nums);

        String woah = "";
        for (int i = 0; i < nums.length; i++) {
            woah += nums[i] + "+";
        }

        if (woah.endsWith("+")) {
            woah = woah.substring(0, woah.length() - 1);
        }

        System.out.print(woah);

    }
}
