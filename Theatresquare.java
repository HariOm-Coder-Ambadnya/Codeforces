import java.util.Scanner;

public class Theatresquare{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        int length = (n+a-1) / a;
        int width = (m+a-1) / a;

        int total = length * width;

        System.out.println(total);



    }
}