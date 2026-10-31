import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        // ArrayList<Integer> even = new ArrayList<>();
        // ArrayList<Integer> odd = new ArrayList<>();

        // for (int i = 1; i <= n; i++) {
        //     if (i % 2 != 0) {
        //         odd.add(i);
        //     } else {
        //         even.add(i);
        //     }

        // }

        // odd.addAll(even);

        
        //         System.out.println(odd.get(k-1));


        // use formula

        long oddcount = (n+1) / 2;

        if(k <= oddcount){
            System.out.println(2 * k - 1);
        }else{
            System.out.println(2 * (k - oddcount));
        }
            
        

    }
}
