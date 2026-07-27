import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = n/5;

        if(n%5 != 0){
            ans = ans + 1;
        }

        System.out.println(ans);
        
    }
}
