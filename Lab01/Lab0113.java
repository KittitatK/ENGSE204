
package Lab01;
import java.util.Scanner;

public class Lab0113 {
    public static void main(String[] monidas){
        Scanner input = new Scanner(System.in);

        System.out.println("Monitoring Dashboard");

        System.out.print("Enter Line : ");
        int r = input.nextInt();

        System.out.print("Enter Column : ");
        int c = input.nextInt();

        int[][] Monitor = new int[r][c];

        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Enter Status (0=0ffline, 1=0nline):");
        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
                Monitor[i][j] = input.nextInt();
            }
        }

        System.out.println("---------------------------------------------------------------------------------");

        int count = 0;

        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
                if(Monitor[i][j] == 1){
                    count ++;
                }
            }
        }

        System.out.println("Online Servers = "+ count + " Unit(s)");

        input.close();
    }
}
