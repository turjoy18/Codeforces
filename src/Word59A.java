import java.util.Scanner;

public class Word59A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int upper = 0;
        int lower = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
            } else {
                lower++;
            }
        }

        if (upper > lower) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }

    }
}
