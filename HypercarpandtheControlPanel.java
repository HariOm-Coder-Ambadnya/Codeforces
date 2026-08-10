import java.util.ArrayList;
import java.util.Scanner;

public class HypercarpandtheControlPanel {

    public int swap(int a , int b){

    }
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int count = 2;

            ArrayList<Integer> lst = new ArrayList<>();

            if(n < 2){
                System.out.println(n);
            }

            for (int i = 0; i < n; i++) {
                lst.add(i);
            }

            for (int i = 0; i < n-1; i++) {
                for (int j = 1; j < n; j++) {
                    if(lst.get(i) == lst.get(j)){

                    }
                }
            }

        }

    }
}
