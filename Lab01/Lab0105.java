package Lab01;
import java.util.Scanner;

public class Lab0105 {
    public static void main(String[] menm){
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Number");

        System.out.println("Enter Number ( 1 - 4 ) : ");
        int num = input.nextInt();

         if(num == 1){
            System.out.println("Americano"); 
        }
        else if(num == 2){
            System.out.println("Latte");
        }
        else if(num == 3){
            System.out.println("Espresso");
        }
        else if(num == 4){
            System.out.println("Mocha");
        }
        else{
            System.out.println("Please try again");
        }

        input.close();
    }
    
}
