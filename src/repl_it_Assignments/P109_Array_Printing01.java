package repl_it_Assignments;

import java.util.Scanner;

public class P109_Array_Printing01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items
        //write your code below

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].substring(0, 3));

        }
    }
}