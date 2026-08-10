import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        
        st.nextToken();
        int t = (int) st.nval;
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st.nextToken();
            int n = (int) st.nval;
            
            int[] a = new int[n];
            long total = 0;
            Map<Integer, Integer> cnt = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                st.nextToken();
                a[i] = (int) st.nval;
                total += a[i];
                cnt.put(a[i], cnt.getOrDefault(a[i], 0) + 1);
            }
            
            // find value with max frequency
            int v = -1, m = 0;
            for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
                if (e.getValue() > m) {
                    m = e.getValue();
                    v = e.getKey();
                }
            }
            
            long ans;
            if (m <= (n + 1) / 2) {
                ans = total;
            } else {
                int R = n - m;
                ans = (total - (long) m * v) + (long) (R + 2) * v;
            }
            
            sb.append(ans).append('\n');
        }
        
        System.out.print(sb);
    }
}