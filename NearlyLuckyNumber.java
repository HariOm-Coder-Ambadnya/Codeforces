import java.util.HashSet;
import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        HashSet<Long> set = new HashSet<>();
        int count = 0;

        while(n > 0){
            long k = n % 10;
            if(k == 7 || k == 4){
                count++;
            }
            n = n/10;
        }

        // System.out.println(count);

        if(count == 7 || count == 4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
