import java.util.Scanner;

public class BoyOrGirl236A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String username = in.nextLine();

        boolean[] alreadyFound = new boolean[256];
        int count = 0;

        for (char ch : username.toCharArray()) {
            if (!alreadyFound[ch]) {
                alreadyFound[ch] = true;
                count++;
            }
        }

        if (count % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

    }
}
