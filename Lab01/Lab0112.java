package Lab01;
import java.util.Scanner;

public class Lab0112 {

    public static void main(String[] Invent){
        Scanner input = new Scanner(System.in);

        System.out.println("Inventory Management Program");

        System.out.print("How Many Type You Want To Input : ");
        int type = input.nextInt();

        int[] Id = new int[type];
        int[] stock = new int[type];

        for (int i = 0 ; i < type ; i++){
            System.out.println("Enter ID : " + (i+1));
            Id[i] = input.nextInt();

            System.out.println("Enter Stock : " + (i+1));
            stock[i] = input.nextInt();
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("Enter ID ");
        int key = input.nextInt();

        int i;
        for (i = 0; i < type; i++) {
            if (key == Id[i]) {
                System.out.printf("In Stock %d Piece",stock[i]);
                break;
            }
        }

        if (i == type) {
            System.out.printf("Product %d not found", key);
        }

        input.close();
    }
    
}


 /*if ( key == Id[i]){
            System.out.printf("In Stock %d Piece",stock[i]);
        }else{
            System.out.printf("Product %d not found", key);
        }*/