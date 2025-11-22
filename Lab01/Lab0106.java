package Lab01;
import java.util.Scanner;

public class Lab0106 {
    public static void main(String[] mulnu){
        Scanner input = new Scanner(System.in);

        System.out.println("multiply number");

        System.out.println("Enter Number");
        int num = input.nextInt();

        for(int i = 1 ; i <= 12 ; i++){
            System.out.printf("%d x %d = %d\n", num, i, (num * i));
        }

        input.close();
    }
}
