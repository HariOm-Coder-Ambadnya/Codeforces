import java.util.Scanner;

public class Georgeandaccod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;


        for (int i = 0; i < n; i++) {
            
            int livingpeople = sc.nextInt();
            int capacity = sc.nextInt();

            if(capacity - livingpeople >= 2){
                count++;
            }

        }

        System.out.println(count);
}

}