import java.util.Arrays;
import java.util.Scanner;

public class Twin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] coins = new int[n];
        int totalsum = 0;


        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
            totalsum += coins[i];
        }

        Arrays.sort(coins);
        int mysum = 0;
      int count = 0;

        for (int i = n -1; i >= 0; i--) {
            mysum += coins[i];
            count++;
            int twinsum = totalsum - mysum;
            
            if(mysum > twinsum){
                break;
            }
            
        }

        System.out.println(count);

    }
}
 