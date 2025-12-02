package Lab02o10;
import java.util.Scanner;

public class Main {

    public static void main(String[] shopppy){

        Scanner input = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.println("------( ShoppingCart )------");
        System.out.println("Enter Num Of Product");
        int num = input.nextInt();
        input.nextLine();
      

        for (int i = 0 ; i < num ; i++ ){
            System.out.println("Enter Product Name");
            String pr = input.nextLine();

            System.out.println("Enter Price");
            double p = input.nextDouble();

            input.nextLine();
          
            Product prod = new Product(pr,p);
            cart.addProduct(prod);
   
        }

        double total = cart.calculateTotalPrice();
        System.out.println("Total Price = " + total);

        input.close();
    }
    
}
