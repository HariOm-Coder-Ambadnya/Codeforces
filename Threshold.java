import java.util.Scanner;

public class Threshold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
            }

            if (n % 2 != 0) {
                sb.append("NO\n");
                continue;
            }

            long minOdd = Long.MAX_VALUE;  
            long maxEven = Long.MIN_VALUE; 

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) { 
                    minOdd = Math.min(minOdd, w[i]);
                } else { 
                    maxEven = Math.max(maxEven, w[i]);
                }
            }

            if (minOdd - maxEven >= 2) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}