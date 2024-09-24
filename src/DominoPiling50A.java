import java.util.Scanner;

public class DominoPiling50A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int answer = m * n;
        System.out.println(answer / 2);

    }
}
