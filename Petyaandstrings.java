import java.util.Scanner;

public class Petyaandstrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st1 = sc.nextLine();
        String st2 = sc.nextLine();

        String s1 = st1.toLowerCase();
        String s2 = st2.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {


            if(s1.charAt(i) < s2.charAt(i)){
                System.out.println("-1");
                return;
            }
            if(s1.charAt(i) > s2.charAt(i)){
                System.out.println("1");
               return;
            }

        }
        
        System.out.println("0");



    }
}
