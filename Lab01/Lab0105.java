package Lab01;
import java.util.Scanner;

public class Lab0105 {
    public static void main(String[] menm){
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Number");

        System.out.println("Enter Number ( 1 - 4 ) : ");
        int num = input.nextInt();

        switch(num){
            case 1:
                System.out.println("Americano");
                break;

            case 2:
                System.out.println("Latte");
                break;

            case 3:
                System.out.println("Espresso");
                break;
            
            case 4:
                System.out.println("Mocha");
                break;

             default:
                System.out.println("Please try again");

        }

        input.close();
    }
    
}
