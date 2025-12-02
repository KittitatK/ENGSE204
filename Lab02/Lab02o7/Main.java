package Lab02o7;
import java.util.Scanner;

public class Main {

    public static void main(String[] bankacc){
        Scanner input = new Scanner(System.in);

        System.out.println("------( Bank amount )------");
        System.out.println("Owner Name :");
        String name = input.nextLine(); 

         System.out.println("Balance :");
        double bl = input.nextDouble();

        System.out.println("Amount 1:");
        double am1 = input.nextDouble();

        System.out.println("Amount 2:");
        double am2 = input.nextDouble();

        BankAccount bk = new BankAccount(name,am1,bl);

        bk.withdraw(am1);
        bk.withdraw(am2);
        bk.displayBalance();

        input.close();
    }
        
}


