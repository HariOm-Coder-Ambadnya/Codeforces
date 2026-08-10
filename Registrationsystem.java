import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Registrationsystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // ArrayList<String> lst = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(!map.containsKey(s)){
                map.put(s, 1);
                System.out.println("OK");
            }else{
                System.out.println(s + map.get(s));
                map.put(s, map.get(s)+1);           
                }
        }


    }
}
