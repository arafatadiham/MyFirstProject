package repl_it_Assignments;

import java.util.Scanner;

public class P116_Arrays_CountOfEvenNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
        // above code will ask user 10 numbers while creating an array
        // just assume that you have int array with 10 numbers and start working on requirement
        // loop through the array and get the count of the even numbers
        //TODO: Write your code below
// [2,2,2,11,11,11,33,3,3,0]

        int counter = 0;
        int x= nums[0];

         // for ( int eachNumber: nums){
        for (int i=0; i <nums.length; i++){

            if (nums[i]%2==0 ) {
                counter++;

            }
        }
        System.out.println(counter);
    }
}
