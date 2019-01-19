
import java.util.*;

public class ShoppingBasket {

    private List<Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price) {

        Purchase purchase = new Purchase(product, 1, price);

        if (!this.purchases.contains(purchase)) {
            this.purchases.add(purchase);
        } else if (this.purchases.contains(purchase)){
            int where = this.purchases.indexOf(purchase);
            this.purchases.get(where).increaseAmount();
        }else{
           
        }
    }

    public int price() {
        int total = 0;
        for (Purchase i : this.purchases) {
            total = total + i.price();
        }

        return total;
    }

    public void print() {
        for (Purchase i : this.purchases) {
            
            System.out.println(i.toString());
            
        }
    }
}