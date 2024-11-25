import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Laptop", 1000, true));
        products.add(new Electronics("Headphones", 50, true));
        products.add(new Grocery("Milk", 2, true));

        Cart cart = new Cart();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== E-Commerce Cart System ===");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Update Quantity");
            System.out.println("5. Remove Product from Cart");
            System.out.println("6. Apply Discount");
            System.out.println("7. View Total Bill");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Products:");
                    for (Product product : products) {
                        System.out.println(product.getName() + " - $" + product.getPrice() + " - Available: " + product.isAvailable());
                    }
                    break;

                case 2:
                    System.out.print("\nEnter product name to add: ");
                    String addProductName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    Product productToAdd = products.stream()
                            .filter(p -> p.getName().equalsIgnoreCase(addProductName))
                            .findFirst()
                            .orElse(null);

                    if (productToAdd != null) {
                        cart.addProduct(productToAdd, quantity);
                        System.out.println("Product added to cart.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.println("\nYour Cart:");
                    cart.viewCart();
                    break;

                case 4:
                    System.out.print("\nEnter product name to update: ");
                    String updateProductName = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    cart.updateQuantity(updateProductName, newQuantity);
                    break;

                case 5:
                    System.out.print("\nEnter product name to remove: ");
                    String removeProductName = scanner.nextLine();
                    cart.removeProduct(removeProductName);
                    System.out.println("Product removed from cart.");
                    break;

                case 6:
                    System.out.println("\nAvailable Discounts:");
                    System.out.println("1. No Discount");
                    System.out.println("2. 10% Discount");
                    System.out.println("3. Buy One Get One Free");
                    System.out.print("Choose a discount: ");
                    int discountChoice = scanner.nextInt();

                    switch (discountChoice) {
                        case 1:
                            cart.setDiscountStrategy(new NoDiscount());
                            System.out.println("No discount applied.");
                            break;
                        case 2:
                            cart.setDiscountStrategy(new PercentageDiscount(10));
                            System.out.println("10% discount applied.");
                            break;
                        case 3:
                            cart.setDiscountStrategy(new BuyOneGetOneFree());
                            System.out.println("Buy One Get One Free discount applied.");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 7:
                    System.out.println("\nTotal Bill: $" + cart.calculateTotal());
                    break;

                case 8:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
