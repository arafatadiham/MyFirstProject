package repl_it_Assignments;

import java.util.Scanner;

public class P114_Arrays_FindSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum = 0;

        for (int x=0; x < nums.length; x++){
            sum= sum + nums[x];
        }
        System.out.println(sum);

    }
}
