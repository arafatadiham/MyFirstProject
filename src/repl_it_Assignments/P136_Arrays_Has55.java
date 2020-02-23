package repl_it_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class P136_Arrays_Has55 {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

                //TODO Type your code below:
                // {1,5,5,1,1}
                boolean contains = false;

                int number= nums[0];
                for(int i =0; i < nums.length; i++) {

                    //  for ( int eachItem : nums){
                    if (i != nums.length - 1 && nums[i] == 5 && nums[i + 1] == 5) {

                        contains = true;
                    }
                }
                    System.out.println(contains);
                }


            }


// int indexLocation= Arrays.binarySearch(nums,5);
//  int indexLocation=i;

//THIRD WAY

//nums → [1, 8, 5, 5, 0] → true
// System.out.println(Arrays.toString(nums).contains("5, 5"));