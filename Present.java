import java.util.HashMap;
import java.util.Scanner;

public class Present {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int t = sc.nextInt();

        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(arr[i], i);
        }

        for (int i = 1; i <= n; i++) {
            // System.out.println(map);
            System.out.print(map.get(i) + " ");

        }
    }
}