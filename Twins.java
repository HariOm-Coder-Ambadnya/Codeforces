import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 2;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);


        int end = arr[arr.length - 1];

        for (int i = 1; i <= n; i++) {
            int sum = arr[0] + arr[1];

            if(sum < end){
                sum = sum + arr[i];
                count++;
            }else{
                return;
            }

        }

        System.out.println(count);

    }
}
