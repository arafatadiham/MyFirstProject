package repl_it_Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class P174_PrintUniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        ArrayList<Integer> unique = new ArrayList<>();

        for (int each : nums){

            if (!unique.contains(each)) {
                unique.add(each);
            }
        }
        System.out.println(unique);
    }
}