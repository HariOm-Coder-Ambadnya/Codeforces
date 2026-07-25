import java.util.Scanner;

public class YoungPhysicst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[][] arr = new int[a][3];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sumx = 0;
        int sumy = 0;
        int sumz = 0;

        for (int i = 0; i < a; i++) {
            sumx = sumx + arr[i][0];
            sumy = sumy + arr[i][1];
            sumz = sumz + arr[i][2];
        }

        if(sumx==0 && sumy==0 && sumz == 0){
            System.out.println("YES");
        }else{ 
            System.out.println("NO");
        }

    }
}
