package Lab02o7;

public class BankAccount {
    private String name;
    private double amount;
    private double balance;
    
    
    public BankAccount(String n, Double am, Double bl){
        this.name = n;
        this.amount = am;
        this.balance = bl;

    }

    public void withdraw(Double am){
        
        if(this.balance >= am ){
            this.balance -= am;
            System.out.println("Status  : Withdrawal successful.") ;

        }else{
            System.out.println("Status  : Insufficient funds.");
        }
    }

    public void displayBalance(){
        System.out.println("Balance :" + this.balance);
    }
}
