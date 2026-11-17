package module4.activity;

public class Circle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter methods
    @Override
    public double calculateArea(double length, double breadth, double radius) {

        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {

        return 2 * Math.PI * radius;
    }
}
