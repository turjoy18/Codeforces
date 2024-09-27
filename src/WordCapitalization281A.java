import java.util.Scanner;

public class WordCapitalization281A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String cap = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        System.out.println(cap);

    }
}
