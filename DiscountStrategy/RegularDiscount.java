package DiscountStrategy;

public class RegularDiscount implements DiscountStrategy{
    @Override
    public double discountStrategy(double total) {
        return total*0.1;
    }

    @Override
    public String customerType() {
        String reg= "Regular Customer";
        return reg;
    }
}
