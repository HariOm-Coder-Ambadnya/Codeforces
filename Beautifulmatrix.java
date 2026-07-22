import java.util.Scanner;

public class Beautifulmatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int row = 0;
        int col = 0;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[i][j] == 1){
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        int ans = Math.abs(row - 3) + Math.abs(col - 3);

        System.out.println(ans);


    }
}
