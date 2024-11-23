//package ecommerce;

public class BuyOneGetOneFree implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        return total / 2;
    }
}
