import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i) == s2.charAt(i) ? "0" : "1");
        }
        System.out.println(result);
    }
}
