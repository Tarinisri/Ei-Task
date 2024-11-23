# Task Documentation
This repository contains two main exercises:

## Exercise 1: Console-Based Simple E-commerce Cart System Programming Excercise

### Overview
The E-Commerce Cart System is a console-based application showcasing object-oriented principles and design patterns like Prototype, Strategy, and Singleton. It allows users to manage a shopping cart, apply discounts, and calculate the total bill interactively.

**Key Features**
-**Product Management:**
- Add, update, or remove products with attributes like name, price, and availability.

-**Cart Operations:**
- Manage items in the cart, update quantities, and view totals.

-**Discounts:**
- Apply No Discount, Percentage Discount, or Buy One Get One Free (BOGOF) strategies dynamically.

-**Design Patterns:**
Prototype: Clone products to avoid shared references.
Strategy: Choose and apply discount strategies dynamically.
Singleton: Extendable for centralized logging or configuration.

-**Interactive CLI:**
View products, manage cart contents, apply discounts, and compute totals seamlessly.


## Exercise 2: Design Pattern Excercise

### Overview
This exercise demonstrates the application of various design patterns through practical examples. The included patterns are:

### Creational Patterns
- **Builder Pattern**: The Builder Pattern is demonstrated through a car assembly system where a CarBuilder is used to construct a car step by step.
- **Factory Pattern**: The Factory Pattern is demonstrated through a shape creation system, where the factory creates objects based on the requested shape type.
- **Singleton Pattern**: The Singleton Pattern ensures only one instance of a logger is used throughout the application.

### Behavioral Patterns:
  - **Chain of Responsibility Pattern**: The Chain of Responsibility Pattern is demonstrated through a support ticket system that processes different types of issues by passing them along a chain of handlers.
  - **Observer Pattern**: The Observer Pattern is demonstrated through a stock market notification system where clients (observers) are notified of stock price changes by the stock market (subject).
  - **Memento Pattern**: The Memento Pattern is demonstrated in a text editor that allows saving and restoring its content state.

### Structural Patterns
- **Adapter Pattern**: The Adapter Pattern bridges two incompatible interfaces, enabling seamless interaction is demonstarted through Payment Integration System.
- **Facade Pattern**: The Facade Pattern provides a simplified interface to a complex subsystem which is demonstrated through Video Conversion System.
- **Proxy Pattern**: The Proxy Pattern provides a surrogate to control access to an object, adding additional functionality like caching is demonstarted through API Service with Caching.