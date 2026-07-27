import java.util.HashSet;
import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        HashSet<Long> set = new HashSet<>();

        while(n > 0){
            long k = n % 10;
            set.add(k);
            n = n/10;
        }

        // System.out.println(set);

        if(set.contains(4) || set.contains(7)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
