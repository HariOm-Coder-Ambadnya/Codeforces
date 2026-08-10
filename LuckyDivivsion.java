import java.util.Scanner;

public class LuckyDivivsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lucky = {4,7,44,47,74,77,444,447,474,477,744,774,747,777};

        int n = sc.nextInt();

        for (int i = 0; i < lucky.length; i++) {
            if(n%lucky[i] == 0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
}
