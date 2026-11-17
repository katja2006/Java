package module4.activity;

/**
 * Activity 3
 */

public class AbstractActivity {

    public static void main(String args[]) {

        // TODO: Create a Rectangle object,
        // set color to "Blue",
        // and print the color
        Rectangle myRectangle = new Rectangle();

        myRectangle.setColor("Blue");

        System.out.println("Rectangle color: " + myRectangle.getColor());

        // TODO: Print the area and perimeter of the rectangle
        // using length = 2, breadth = 4, radius = 0
        System.out.println("Rectangle area: " + myRectangle.calculateArea(2, 4, 0));
        System.out.println("Rectangle perimeter: " + myRectangle.calculatePerimeter(2, 4, 0));


        // TODO: Create a Circle object,
        // set color to "Pink",
        // and print the color
        Circle myCircle = new Circle();

        myCircle.setColor("Pink");

        System.out.println("\nCircle color: " + myCircle.getColor());


        // TODO: Print the area and perimeter of the circle
        // using length = 0, breadth = 0, radius = 5
        System.out.println("Circle area: " + myCircle.calculateArea(0, 0, 5));
        System.out.println("Circle perimeter: " + myCircle.calculatePerimeter(0, 0, 5));
    }
}
