package Lab02o6;
import java.util.Scanner;

public class Main {
    public static void main(String[] amount){
        Scanner input = new Scanner(System.in);

        System.out.println("bank amount");

        System.out.println("Account name :");
        String name = input.nextLine();

        System.out.println("Balance :");
        double bl = input.nextDouble();

        System.out.println("Amount :");
        double am = input.nextDouble();
        
        Bankoaccount bk = new Bankoaccount(name,am,bl);

        bk.displaySummary();

        input.close();
    }
}
