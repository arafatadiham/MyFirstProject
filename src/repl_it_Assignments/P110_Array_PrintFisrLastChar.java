package repl_it_Assignments;

import java.util.Scanner;

public class P110_Array_PrintFisrLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below
/*


        String firstWord = words[0];
        String secondWord = words[1];
        String thirdWord = words[2];
        String fouthWord = words[3];
        String fifthWord = words[4];

        System.out.println(firstWord.charAt(0)+""+firstWord.charAt(firstWord.length()-1));
        ....
 */

        for (String eachWord : words){
            System.out.print(eachWord.charAt(0));
            System.out.println(eachWord.charAt(eachWord.length()-1));
        }
    }
}
