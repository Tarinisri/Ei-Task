//package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;
    private DiscountStrategy discountStrategy;

    public Cart() {
        items = new ArrayList<>();
        discountStrategy = new NoDiscount();
    }

    public void addProduct(Product product, int quantity) {
        if (!product.isAvailable()) {
            System.out.println(product.getName() + " is not available.");
            return;
        }

        for (CartItem item : items) {
            if (item.getProduct().getName().equals(product.getName())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void updateQuantity(String productName, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getName().equals(productName)) {
                if (quantity == 0) {
                    items.remove(item);
                } else {
                    item.setQuantity(quantity);
                }
                return;
            }
        }
        System.out.println(productName + " is not in the cart.");
    }

    public void removeProduct(String productName) {
        items.removeIf(item -> item.getProduct().getName().equals(productName));
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        for (CartItem item : items) {
            System.out.println(item.getQuantity() + " x " + item.getProduct().getName() + " = $" + item.getItemTotal());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getItemTotal();
        }
        return discountStrategy.applyDiscount(total);
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }
}
