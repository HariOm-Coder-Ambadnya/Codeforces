import java.util.HashMap;
import java.util.Scanner;

// Input
// 6
// ADAAAA
// Output
// Anton

// Input
// 7
// DDDAADA
// Output
// Danik

// Input
// 6
// DADADA
// Output
// Friendship


public class atonanddanik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();


        HashMap<Character, Integer> map = new HashMap<>();



        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        // System.out.println(map);
        
        if(map.getOrDefault('A', 0) > map.getOrDefault('D', 0)){
            System.out.println("Anton");
        }else if(map.getOrDefault('A', 0) < map.getOrDefault('D', 0)){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }

    }
}