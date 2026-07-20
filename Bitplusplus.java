import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;

        for (int i = 0; i < n; i++) {

            String operations = sc.next();

            if (operations.contains("++")) {
                x = x + 1;
            }

            if (operations.contains("--")) {
                x = x - 1;
            }

        }

        System.out.println(x);
    }
}