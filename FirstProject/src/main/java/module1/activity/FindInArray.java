package module1.activity;

public class FindInArray {

    public static void main(String[] args) {

        int[] nums = {100, 1, 4, 15};

        //Assume the first number is the largest
        int largest = nums[0];

        //Check the remaining numbers in the array
        for(int i = 1; i < nums.length; i++) {

            //Update the largest number if a bigger number is found
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        //Print the largest number
        System.out.println("The largest number is: " + largest);
    }
}
