import java.util.Scanner;

public class Divisibilityproblem {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = (b - (a%b)) % b;

            System.out.println(ans);

            t--;
        }
        sc.close();

    }
}
