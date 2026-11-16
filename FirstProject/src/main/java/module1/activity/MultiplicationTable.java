package module1.activity;

public class MultiplicationTable {

    public static void main(String[] args) {

        for(int i = 11; i <= 20; i++) {

            for(int j = 1; j <= 10; j++) {

                int multi = i * j;

                //Print multiplication result
                System.out.println(i + " x " + j + " = " + multi);
            }
            System.out.println();
        }
    }
}
