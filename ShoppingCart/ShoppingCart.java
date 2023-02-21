package ShoppingCart;
import DiscountStrategy.DiscountStrategy;

public class ShoppingCart {
    DiscountStrategy discountStrategy;



    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }


    public double calculateTotalCost(double purchaseTotal) {
        return purchaseTotal - discountStrategy.discountStrategy(purchaseTotal);
    }


    public String getDiscountTpeOfCustomer()
    {
        return discountStrategy.customerType();
    }


    
    
}
