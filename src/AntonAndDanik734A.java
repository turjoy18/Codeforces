import java.util.Scanner;

public class AntonAndDanik734A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();

        int A = 0;
        for (char name : s.toCharArray()) {
            if (name == 'A') {
                A++;
            }
        }

        if (A > n - A) {
            System.out.println("Anton");
        } else if (A < n - A) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

    }
}
