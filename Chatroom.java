import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Chatroom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputstr = sc.nextLine();
        int count = 0;

        String givenstring = "hello";
        int j = 0;

        for (int i = 0; i < inputstr.length(); i++) {

            if (j < givenstring.length() && inputstr.charAt(i) == givenstring.charAt(j)) {
                count = count + 1;
                j++;
            } else {
                continue;
            }

        }

        if (count == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
