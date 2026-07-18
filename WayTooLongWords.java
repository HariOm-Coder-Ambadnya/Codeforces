import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stringcount = sc.nextInt();

        for (int i = 0; i <= stringcount; i++) {
        
            String text = sc.nextLine();

        if(text.length() <= 10){
            System.out.println(text);
        }else{

            String shor = text.substring(1, text.length() - 1 );
            System.out.println(text.charAt(0) + "" +(shor.length())+ text.charAt(text.length() - 1));
        }

        }

    }
// text.substring(1, text.length() - 1 );
}
