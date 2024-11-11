import java.util.Scanner;

public class Tram116A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int capacity = 0;
        int current = 0;

        for (int i = 0; i < n; i++) {
            int getOff = in.nextInt();
            int getOn = in.nextInt();
            current += getOn - getOff;
            capacity = Math.max(capacity, current);
        }

        System.out.println(capacity);
        in.close();

    }
}
