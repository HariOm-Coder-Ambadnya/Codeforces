import java.util.Scanner;

public class Goodcontest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[3];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int min = arr[0];

            for (int i = 1; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
            }

           int ans = n - min;
           System.out.println(ans);

        }

    }
}