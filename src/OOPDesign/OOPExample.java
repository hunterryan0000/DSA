package OOPDesign;

// Abstract class to showcase Abstraction
abstract class Shape {
    abstract void draw();
}

// Subclass Circle to showcase Inheritance and Polymorphism
class Circle extends Shape {
    // Encapsulated field radius with public getter and setter
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    // Overridden method to showcase Polymorphism
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Subclass Square to showcase Inheritance and Polymorphism
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    // Overridden method to showcase Polymorphism
    @Override
    public void draw() {
        System.out.println("Drawing a square with side " + side);
    }
}

public class OOPExample {
    public static void main(String[] args) {
        // Utilizing Abstraction to hold any Shape object
        Shape shape1 = new Circle(5);
        Shape shape2 = new Square(4);

        // Polymorphism in action; the draw() method will be called from the object's 'actual' class, not the 'reference' class
        shape1.draw();  // Output: Drawing a circle with radius 5
        shape2.draw();  // Output: Drawing a square with side 4

        // Encapsulation in action
        Circle circle = (Circle) shape1;  // Downcasting
        System.out.println("Current Radius: " + circle.getRadius());  // Output: Current Radius: 5
        circle.setRadius(10);
        System.out.println("Updated Radius: " + circle.getRadius());  // Output: Updated Radius: 10
    }
}
