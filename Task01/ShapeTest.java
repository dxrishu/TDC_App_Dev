package DSA;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    public Circle(double r) { radius = r; }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    public Rectangle(double l, double w) { length = l; width = w; }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;
    public Triangle(double b, double h) { base = b; height = h; }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);
        Shape shape3 = new Triangle(3, 7);

        System.out.println("Circle Area: " + shape1.calculateArea());
        System.out.println("Rectangle Area: " + shape2.calculateArea());
        System.out.println("Triangle Area: " + shape3.calculateArea());
    }
}
