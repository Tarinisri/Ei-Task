#E-Commerce Cart System

**Problem Statement**
Create a console-based E-Commerce Cart System where users can:

- Add products to their shopping cart.
- View, update, and remove products.
- Apply different discount strategies.
- Calculate the total bill.
The system should implement design patterns to demonstrate scalability, modularity, and reusability in real-world e-commerce scenarios.

**Project Overview**
The E-Commerce Cart System is an interactive console-based application that emulates an online shopping cart. It allows users to manage their purchases and apply discounts dynamically. The application leverages object-oriented principles and incorporates design patterns such as Prototype, Strategy, and Singleton to create a robust, extensible solution.

**Project Structure**
`Main.java`
- The entry point of the application.
- Provides a menu-driven interface for users to interact with the cart system.
Offers options to view products, manage the cart, apply discounts, and view the total bill.

`Product.java`
- Abstract class representing a generic product with attributes like name, price, and availability.
- Supports cloning to enable the Prototype Pattern for product addition.

`Electronics.java & Grocery.java`
- Subclasses of Product for specific categories.
- Add category-specific attributes in future implementations.

`CartItem.java`
- Represents a product instance in the cart along with its quantity.
- Computes the total price for the item in the cart.

`Cart.java`
- Manages the shopping cart by adding, removing, and updating items.
- Supports filtering of products and applying discount strategies.
- Handles the total bill computation.

`DiscountStrategy.java`
- Interface for defining discount behaviors.
- Includes implementations:
- NoDiscount: No discount applied.
PercentageDiscount: Applies a percentage discount.
BuyOneGetOneFree: Implements a "Buy One Get One Free" offer.
Logger.java (Optional for Extension)

Can log significant user actions, such as product addition, removal, and checkout events.
##How to Use the E-Commerce Cart System
- Run the Application
Execute the `Main.java` file to start the console-based interface.

- View Products
View a list of available products with their prices and availability.

- Add Products to Cart
Enter the product name and quantity to add it to your cart.

- View Cart
Display all items in your cart along with their total prices.

- Update or Remove Items
Modify quantities or remove items from the cart.

- Apply Discounts
Choose from available discount strategies:

1. No Discount.
2. Percentage-based Discount.
3. Buy One Get One Free.

- Calculate Total Bill

- View the final bill, including any applied discounts.

- Exit
Quit the application when you are done.

##Design Patterns Used
1. Prototype Pattern
Ensures that new instances of Product are clones, avoiding direct references.
Used when adding products to the cart to preserve product immutability.

2. Strategy Pattern
Allows dynamic selection of discount strategies at runtime.
Includes three strategies for applying discounts:
NoDiscount.
PercentageDiscount.
BuyOneGetOneFree.

3. Singleton Pattern (For Future Enhancements)
Can be implemented for logging or managing system-wide configurations to ensure a single instance exists.

## Key Features

**Dynamic Product Management**
- Add, update, and remove products from the cart interactively.
Discount Application
- Choose and apply different discount strategies based on customer preferences.
Real-Time Calculations
- Automatically calculates the total bill as items are added or removed.

**Scalable and Modular Design**
- Easily extendable for adding new product types, categories, or discount strategies.

**Console-Based Interface**
- Intuitive and simple command-line interaction for user convenience.

##Summary
The E-Commerce Cart System demonstrates a functional shopping cart with advanced features like product management, discount strategies, and bill computation. By leveraging design patterns such as Prototype and Strategy, the system ensures scalability and modularity. Future enhancements can include a graphical user interface, logging features, and advanced cart management functionalities like inventory tracking or payment gateways.