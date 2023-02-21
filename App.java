import DiscountStrategy.DiscountStrategy;
import DiscountStrategy.PremiumDiscount;
import DiscountStrategy.RegularDiscount;
import ShoppingCart.ShoppingCart;

public class App {
public static void main(String args[]){
    DiscountStrategy discountStrategy= new RegularDiscount();
    ShoppingCart shoppingCart= new ShoppingCart();
    shoppingCart.setDiscountStrategy(discountStrategy);
    double purchaseTotal = 100.0;
    System.out.println(discountStrategy.customerType());
    System.out.println(shoppingCart.calculateTotalCost(purchaseTotal));

}
    
}
