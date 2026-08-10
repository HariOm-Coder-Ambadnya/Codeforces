import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String t = sc.next();
        String rev = new StringBuilder(n).reverse().toString();

        if(rev.equals(t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        // for (int i = 0; i < n.length(); i++) {
        //     if (n.charAt(i) != t.charAt(n.length() - i - 1)) {

        //         System.out.println("NO");
        //         return;

        //     }
        // }

        // System.out.println("Yes");

    }
}
