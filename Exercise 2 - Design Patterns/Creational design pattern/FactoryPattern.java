//The Shape interface defines a contract for shapes.
//Circle and Rectangle are concrete implementations.
//ShapeFactory decides which shape to create based on input.
//The client only interacts with the factory.


// Product
interface Shape {
    void draw();
}

// Concrete Products
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle.");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle.");
    }
}

// Factory
class ShapeFactory {
    public static Shape createShape(String type) {
        switch (type) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Unknown shape type.");
        }
    }
}

// Client
public class FactoryPattern {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape("Circle");
        shape.draw();
    }
}
