import java.util.Scanner;

public class thebestcard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
        
        int n = sc.nextInt();
        Boolean prime = true;

        for (int i = 2; i <= n; i++) {

            int k = n+1;
            if(k%i == 0){
                prime = false;
            }
        }

        if(prime){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        }





    }
}