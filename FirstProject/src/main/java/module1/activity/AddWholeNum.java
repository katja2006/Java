package module1.activity;

public class AddWholeNum {

    public static void main(String[] args) {

        //Initial variable to store the total sum
        int sum = 0;

        //Add all whole numbers from 50 to 100
        for (int i = 50; i <= 100; i++) {

            sum = sum + i;
        }
        //Print the result
        System.out.println("Sum = " + sum);
    }
}
