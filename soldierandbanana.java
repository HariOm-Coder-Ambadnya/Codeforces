import java.util.Scanner;

public class soldierandbanana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noresult = 0;

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int addsum = 0;

        for (int i = 1; i <= w; i++) {
            addsum = addsum + (k * i);
        }

        if(addsum > n){
        System.out.println(addsum - n);

        }else{
            System.out.println(noresult);
        }


    }
}
