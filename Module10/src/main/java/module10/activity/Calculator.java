package module10.activity;

//Create Calculator class
public class Calculator {

    //Create add methods (method overloading)
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    //Create subtract method
    public int subtract(int x, int y) {
        int diff = 0;

        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }

        return diff;
    }

    //Create divide method
    public int divide(int x, int y) {

        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
    }

    //Create multiply method
    public int multiply(int x, int y) {

        try {
            if (x < 0 || y < 0)
            {
                throw new InvalidMultiplyException();
            }
            return x * y;
            } catch (InvalidMultiplyException e) {
            System.out.println("Invalid input for multiplication");
            return 0;
        }
    }

}
