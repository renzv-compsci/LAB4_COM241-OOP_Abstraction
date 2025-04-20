/* Write a Java program to create an abstract class Shape with abstract 
 * methods calculateArea() and calculatePerimeter(). Create subclasses
 * Circle and Triangle that extends the Shape class and implement the 
 * respective methods to calculate the area and perimeter of each shape.*/

abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape {
    
    double totalArea;
    double radius; 

    double totalCircumference;


    public Circle (double radius) {
        this.radius = radius;
    }

    @Override 
    public void calculateArea() {

        totalArea = Math.PI * radius * radius;

        System.out.println("Area and Circumference of Circle");
        System.out.println("Total Area: " + totalArea);
    }

    @Override 
    public void calculatePerimeter() {

        totalCircumference = Math.PI * 2 * (radius);

        System.out.println("Total Circumference: " + totalCircumference);
    }
}

class Triangle extends Shape {

    double totalArea;
    double base;
    double height;

    double totalPerimeter;
    double side1;
    double side2;
    double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void calculateArea() {

        totalArea = 0.5 * height * base;

        System.out.println("\nTotal Area and Perimeter of Triangle");
        System.out.println("Total Area: " + totalArea);
    }

    @Override 
    public void calculatePerimeter() {

        totalPerimeter = side1 + side2 + side3;

        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}

public class ShapeTest {
    public static void main (String[] args) {

        Shape circle = new Circle(15);
        Shape triangle = new Triangle(2, 50, 3.5, 65, 4);

        circle.calculateArea();
        circle.calculatePerimeter();

        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}