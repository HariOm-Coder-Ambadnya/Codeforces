import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Wrongsubstraction {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {

            int ans = n%10;

            if( ans != 0){
                ans = n - 1 ;
            }else{
                ans = n / 10;
            }

            n = ans;
        }

        System.out.print(n);

    }
}
