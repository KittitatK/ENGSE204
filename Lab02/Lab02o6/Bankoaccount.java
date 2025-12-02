package Lab02o6;

public class Bankoaccount {

    private String name;
    private Double amount;
    private Double balance;

    public Bankoaccount(String n, Double am, Double bl){
        this.name = n;
        this.amount = am;
        this.balance = bl;
    }

    public double deposit(double am, double bl){
        return bl += am;
    }

    public void displaySummary(){
        double bkbalance = deposit(this.amount, this.balance);
        System.out.println("Owner : " + this.name);
        System.out.println("Balance :" + bkbalance);
    }
    
}
