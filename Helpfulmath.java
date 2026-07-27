import java.util.Scanner;

public class Helpfulmath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String sr = s.replace("+", "");

        char[] ch = sr.toCharArray();

        for (int i = 0; i < ch.length-1; i++) {
            for (int j = 0; j < ch.length-i-1; j++) {
                 if (ch[j] > ch[j+1]) {
                char temp = ch[j];
                ch[j] = ch[j+1];
                ch[j + 1] = temp;
            }
            }
        }


        for (int i = 0; i < ch.length; i++) {

            System.out.print(ch[i]);

            if(i != ch.length-1){
                System.out.print("+");
            }


        }

    }

}






