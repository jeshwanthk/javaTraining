// Base class
abstract class Shape {
    protected double area; // Protected data member

    // Abstract method to calculate the area, which must be overridden
    public abstract void calculateArea();

    // Getter method to access the area
    public double getArea() {
        return area;
    }
}


class Circle extends Shape {
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public void calculateArea() {
        area = Math.PI * radius * radius; // Area of Circle = πr^2
    }
}

// Derived class: Square
class Square extends Shape {
    private double side;

    // Constructor for Square class
    public Square(double side) {
        this.side = side;
    }

    // Override calculateArea method for Square
    @Override
    public void calculateArea() {
        area = side * side; // Area of Square = side^2
    }
}

public class Area_Overiding {
    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Shape circle = new Circle(5.0);
        circle.calculateArea();
        System.out.println("Area of Circle: " + circle.getArea());

        // Create a Square object with side length 4
        Square square = new Square(4.0);
        square.calculateArea();
        System.out.println("Area of Square: " + square.getArea());
    }
}
