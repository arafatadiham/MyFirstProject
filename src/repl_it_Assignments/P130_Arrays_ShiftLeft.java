package repl_it_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class P130_Arrays_ShiftLeft {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
       for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

//        int temp = nums[0];
//        nums[0] = nums[3];
//        nums[3] = nums[2];
//        nums[2] = nums[1];
//        nums[1] = temp;

        int temp = nums[0];

        for (int i = 0; i < size-1; i++) {
            nums[i] = nums[i + 1];
        }

        for (int i = 0; i < size-1; i++) {
            nums[size-1]=temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}