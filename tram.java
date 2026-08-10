import java.util.Scanner;

public class tram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxp = 0;
        int p = 0;

        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int entry = sc.nextInt();

            p = p -exit;
            p = p + entry;

            if(p > maxp){
                maxp = p;
            }
        }

        System.out.println(maxp);

    }
}