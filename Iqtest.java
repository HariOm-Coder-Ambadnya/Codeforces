import java.util.Scanner;

public class Iqtest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr =new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evencount = 0;
        int evenidx = 0;

        int oddcount = 0;
        int oddidx = 0;


        for (int i = 0; i < n; i++) {
            if(arr[i]%2 == 0){
                evencount++;
                evenidx = i + 1;
            }
            if(arr[i]%2 == 1){
                oddcount++;
                oddidx = i +1;
            }
        }

        if(evencount == 1){
            System.out.println(evenidx);
        }else{
            System.out.println(oddidx);
        }



    }
}
