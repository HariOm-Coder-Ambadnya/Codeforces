import java.util.HashMap;
import java.util.Scanner;

public class Horseshoe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            map.put(num, num);
        }

        // System.out.println(map.size());

        System.out.println(4 - map.size());

    }
}
