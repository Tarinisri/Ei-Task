// Car is the product with several components like engine, wheels, and paint.
// CarBuilder provides methods to set these components.
// The build() method returns the completed car.
// The client uses the builder to assemble the car in a flexible manner.


// Product with Builder as a static nested class
class Car {
    private String engine;
    private String wheels;
    private String paint;

    private Car() {} // Private constructor to force usage of Builder

    public void setEngine(String engine) { this.engine = engine; }
    public void setWheels(String wheels) { this.wheels = wheels; }
    public void setPaint(String paint) { this.paint = paint; }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", paint=" + paint + "]";
    }

    // Builder as a static nested class
    public static class CarBuilder {
        private Car car;

        public CarBuilder() {
            car = new Car();
        }

        public CarBuilder setEngine(String engine) {
            car.setEngine(engine);
            return this;
        }

        public CarBuilder setWheels(String wheels) {
            car.setWheels(wheels);
            return this;
        }

        public CarBuilder setPaint(String paint) {
            car.setPaint(paint);
            return this;
        }

        public Car build() {
            return car;
        }
    }
}

// Client
public class BuilderPattern {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
            .setEngine("V8")
            .setWheels("Alloy")
            .setPaint("Red")
            .build();
        System.out.println(car);
    }
}