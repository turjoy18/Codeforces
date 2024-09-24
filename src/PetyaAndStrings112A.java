import java.util.Scanner;

public class PetyaAndStrings112A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        String First = first.toLowerCase();
        String Second = second.toLowerCase();

        for (int i = 0; i < first.length(); i++) {
            if (First.charAt(i) < Second.charAt(i)) {
                System.out.println(-1);
                return;
            } else if (First.charAt(i) > Second.charAt(i)) {
                System.out.println(1);
                return;
            } else if (First.equals(Second)) {
                System.out.println(0);
                return;
            }
        }

    }
}
