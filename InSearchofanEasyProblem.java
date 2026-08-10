import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            set.add(k);
        }

        if(set.contains(1)){
            System.out.println("Hard");
            return;
        }

        System.out.println("Easy");

    }
}
