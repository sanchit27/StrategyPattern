package DiscountStrategy;

public class PremiumDiscount implements DiscountStrategy{
    @Override
    public double discountStrategy(double total) {
        return total*0.2;
    }

    @Override
    public String customerType() {
        String premium= "Premium User";
        return premium;
    } 
}
