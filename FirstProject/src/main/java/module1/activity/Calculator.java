package module1.activity;

public class Calculator {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int[] nums = {1, 2, 3, 4};

        System.out.println("Addition - " + add(x,y));
        System.out.println("Subtraction - " + subtract(x,y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x,y));
    }

    //Addition
    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    //Subtraction
    private static int subtract(int x, int y) {
        int sub = x - y;
        return sub;
    }

    //Multiplication
    private static int multiply(int[] nums) {
        int temp = 1;

        for(int i = 0; i < nums.length; i ++) {
            temp = temp * nums[i];
        }
        return temp;
    }

    //Division
    private static int divide(int x, int y) {
        int div = x / y;
        return div;
    }
}
