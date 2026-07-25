import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        String str = sc.next().toLowerCase();
    
        HashMap<Character,Boolean> map = new HashMap<>();
        
        map.put('a',true);
        map.put('o',true);
        map.put('y',true);
        map.put('e',true);
        map.put('u',true);
        map.put('i',true);


        for (int i = 0; i < str.length(); i++) {

            if(!map.containsKey(str.charAt(i))){
                System.out.print(".");
                System.out.print(str.charAt(i));
            }else{
                continue;
            }

        }
    }
}
