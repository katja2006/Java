package module1.activity;

public class NumToWordsUsingMethod {

    public static void main(String[] args) {

        int num = 8;

        //Call the method to print the number as a word
        printWord(num);
    }

    //Method that converts a number into its text value
    public static void printWord(int num) {

        switch(num) {

            case 1: System.out.println("one");
                break;
            case 2: System.out.println("two");
                break;
            case 3: System.out.println("three");
                break;
            case 4: System.out.println("four");
                break;
            case 5: System.out.println("five");
                break;
            case 6: System.out.println("six");
                break;
            case 7: System.out.println("seven");
                break;
            case 8: System.out.println("eight");
                break;
            case 9: System.out.println("nine");
                break;
            case 10: System.out.println("ten");
                break;
            default: System.out.println("Number is out of range");
        }
    }
}
