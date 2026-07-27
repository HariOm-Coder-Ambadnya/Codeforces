import java.util.Scanner;

public class Stoneontable {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int count = 0;
        int k = sc.nextInt();


        String n = sc.next();

        for (int i = 1; i < n.length(); i++) {
            if(n.charAt(i) == n.charAt(i-1)){
                count++;
            }
        }

        System.out.println(count);
        
    }
}
