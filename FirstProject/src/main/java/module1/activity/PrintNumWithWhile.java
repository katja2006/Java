package module1.activity;

public class PrintNumWithWhile {

    public static void main(String[] args) {

        int x = 1;

        //Print all odd numbers less than 100
        while(x < 100) {

            System.out.println(x);

            //Move to the next odd number
            x = x + 2;
        }
    }
}
