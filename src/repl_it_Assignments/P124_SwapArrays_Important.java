package repl_it_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class P124_SwapArrays_Important {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        //TODO: write your code below

    for (int i= 0, j=nums.length-1; i< nums.length/2; i++, j--) {
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }

        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}