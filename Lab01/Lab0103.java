package Lab01;
import java.util.Scanner;

public class Lab0103 {
    public static void main(String[] evod) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check  Even , Odd number");

        System.out.println("Enter number : ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("This number is Even number");
        }else{
            System.out.println("This number is Odd number");

        } 

        input.close();
    }
    
}
