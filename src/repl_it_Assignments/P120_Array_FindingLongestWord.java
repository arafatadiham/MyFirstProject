package repl_it_Assignments;

import java.util.Scanner;

public class P120_Array_FindingLongestWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

        String longestWord = words[0];
        int LengthOfLongestWord= words[0].length();

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > LengthOfLongestWord){
                longestWord = words[i];
            }

        }

        System.out.println("Longest Word :  " + longestWord);

    }
}
