import java.util.ArrayList;
import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        String prev = sc.next();

        int count = 1;

        for (int i = 1; i < n; i++) {

            String curr = sc.next();
            
            if(!curr.equals(prev)){
                count++;
            }

            prev = curr;
        }

        System.out.println(count);
        
    }

}