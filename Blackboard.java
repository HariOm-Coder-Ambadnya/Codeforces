import java.util.Arrays;
import java.util.Scanner;

public class Blackboard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            // int n = sc.nextInt();

            int[] arr = new int[3];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            // int min = Integer.MAX_VALUE;
            // int max = Integer.MIN_VALUE;

                        Arrays.sort(arr);


            if (arr[0] + arr[1] < arr[2]) {
                arr[2] = arr[0] + arr[1];
            }



            System.out.println(arr[2] - arr[0]);
            

        }

    }
}
