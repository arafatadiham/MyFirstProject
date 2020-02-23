package repl_it_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class P141_Array_MakeLast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int lastIndex = nums[nums.length-1];
        int[] newArray = new int[size*2];
        int temp = newArray.length -1;
        newArray[temp] = lastIndex;
        System.out.println(Arrays.toString(newArray));


    }
}
