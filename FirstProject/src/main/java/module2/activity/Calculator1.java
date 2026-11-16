package module2.activity;

public class Calculator1 {

    private String calculatorType;

    public static final String CALC_TYPE_BASIC = "Basic";

    //Default constructor
    public Calculator1() {
        calculatorType = CALC_TYPE_BASIC;
    }

    //Parameterized constructor
    public Calculator1(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    //Getter for calculatorType
    public String getCalculatorType() {
        return calculatorType;
    }

    //Setter for calculatorType
    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    //Add
    public int add(int x, int y) {

        int sum = x + y;

        return sum;
    }

    //Subtract
    public int subtract(int x, int y) {

        int diff = 0;

        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }

        return diff;
    }

    //Multiply all numbers in the array
    public int multiply(int[] numbers) {

        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }

        return temp;
    }

    //Divide and handle division by zero
    public int divide(int x, int y) {

        int divValue = 0;

        if (y != 0) {
            divValue = x / y;
        } else {
            System.out.println("Cannot divide by zero");
        }

        return divValue;
    }
}