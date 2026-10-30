import java.util.*;

public class documents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            Stack<Integer> memory = new Stack<>();
            boolean[] printed = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {

                char command = s.charAt(i - 1);

                if (command == '1') {
                    memory.push(i);

                } else if (command == '2') {

                    if (!memory.isEmpty()) {
                        int document = memory.pop();
                        printed[document] = true;
                    } else {
                        printed[i] = true;
                    }

                } else if (command == '3') {

                    printed[i] = true;
                }
            }

            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (!printed[i]) {
                    count++;
                }
            }

            System.out.println(count);

            for (int i = 1; i <= n; i++) {
                if (!printed[i]) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}