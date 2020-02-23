package repl_it_Assignments;
import java.util.*;
import java.util.Arrays;

public class P122_Important_FindNon_Duplicate {
    public static void main(String[] args) {


        //nums -> [1, 1, 2, 3, 4, 3, 4]
        //Given an array nums with 7 integers every element is repeated twice - except one.
        // Find that element and print it to console.

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        for (int j = 0; j < nums.length; j++) {
            int counter = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] == nums[i]) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.println(nums[j]);
            }

        }
    }
}