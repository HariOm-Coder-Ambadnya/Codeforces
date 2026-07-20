import java.util.Scanner;

public class Dominopiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberofrows = sc.nextInt();
        int numberofcols = sc.nextInt();

        int totalblock = numberofrows * numberofcols;

        int ans = totalblock / 2 ;

        System.out.println(ans);
    }
}
