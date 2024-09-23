import java.util.Scanner;

public class WayTooLongWords71A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        int counter = 0;
        while (counter < n) {
            String s = in.nextLine();
            String ans = "";
            if (s.length() > 10) {
                ans = s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1);
            } else {
                ans = s;
            }
            System.out.println(ans);
            counter++;
        }
        in.close();

    }
}
