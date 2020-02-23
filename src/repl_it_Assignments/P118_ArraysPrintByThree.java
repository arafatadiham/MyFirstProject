package repl_it_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class P118_ArraysPrintByThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < arr.length-2; i ++) {

         //   for (int j = 0; j < arr.length-3; j += 3) {
                System.out.println(arr[i]+" , "+ arr[i+1]+ " , "+ arr[i+2]);
          //  }
            // When i=0,
        }
    }
}
/*

The code provided in your main method will take in six Strings and save them into an array called arr.
Print out the 3 neighboring items of the array in one line until the last line
each line should contain 3 neighboring items of array element as displayed below
user for loop

Example:

arr -> ["apple", "banana","kiwi", "grape","milk","soda"]

 prints:  apple , banana , kiwi

          banana , kiwi , grape

          kiwi , grape , milk

          grape , milk , soda
 */