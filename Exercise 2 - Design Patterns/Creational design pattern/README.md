# Creational Design Patterns

This folder focuses on patterns that handle object creation in a way that promotes flexibility and reusability.

## 1. Builder Pattern: Car Assembly System

The Builder Pattern is demonstrated through a car assembly system where a CarBuilder is used to construct a car step by step.

**Key Components:**
- Product: `Car`
- Builder: `CarBuilder`
- Client Code: `Builder.java`

**Description:**

This example shows how a car is assembled by specifying components like engine, wheels, and paint. The CarBuilder provides a fluent interface to set these attributes and build the car.

**Benefits:**
- Simplifies construction of complex objects with optional parameters.
- Improves code readability with a step-by-step approach.

## 2. Factory Pattern: Shape Creation System

The Factory Pattern is demonstrated through a shape creation system, where the factory creates objects based on the requested shape type.

**Key Components:**
- Product Interface: `Shape`
- Concrete Products: `Circle, Rectangle`
- Factory: `ShapeFactory`
- Client Code: `Factory.java`

**Description:**

This example shows how shapes like Circle and Rectangle are created through a centralized factory method. The client specifies the type of shape, and the factory returns the appropriate object.

**Benefits:**
- Decouples object creation logic from client code.
- Simplifies the addition of new shapes by extending the factory.

## 3. Singleton Pattern: Logger System

The Singleton Pattern ensures only one instance of a logger is used throughout the application.

**Key Components:**
- Singleton Class: `Logger`
- Client Code: `Singleton.java`

**Description:**

This example demonstrates a logging system that ensures all log messages are handled by a single instance of the Logger class, enabling centralized control and resource efficiency.

**Benefits:**
- Guarantees a single instance of the logger across the application.
- Simplifies global access to a common resource.