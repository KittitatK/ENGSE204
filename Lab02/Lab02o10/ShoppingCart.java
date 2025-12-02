package Lab02o10;

public class ShoppingCart {
        
    private Product[] item = new Product[10];
    private int itemCount = 0;

    public void addProduct(Product p){
        item[itemCount] = p;
        itemCount++;

      
    }

    public double calculateTotalPrice(){

        double total = 0;

        for (int i = 0 ; i < itemCount ; i++){
            total += item[i].getPrice();
        }
        
        return total;
    }
    
    
}
